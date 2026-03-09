const express = require("express");
const sqlite3 = require("sqlite3").verbose();

const app = express();
app.use(express.json());

const db = new sqlite3.Database("agenda.db");

db.run(`
  CREATE TABLE IF NOT EXISTS contatos (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  nome TEXT,
  telefone TEXT,
  email TEXT
  )
  `)


app.get("/", (req, res) => {
  res.send("API da Agenda funcionando");
});

app.listen(3000, () => {
  console.log("Servidor rodando na porta 3000");
});

app.post("/contatos", (req, res) => {
    const { nome, telefone, email } = req.body;

    db.run(
        "INSERT INTO contatos (nome, telefone, email) VALUES (?, ?, ?)",
        [nome, telefone, email],
        function (err) {
            if (err) {
                res.status(500).send(err);
            } else {
                res.send({ id: this.lastID });
            }
        }
    );
});

app.get("/contatos", (req, res) => {
    db.all("SELECT * FROM contatos", [], (err, rows) => {
        if (err) {
            res.status(500).send(err);
        } else {
            res.json(rows);
        }
    });
});

app.delete("/contatos/:id", (req, res) => {
    const id = req.params.id;

    db.run("DELETE FROM contatos WHERE id = ?", id, function(err) {
        if (err) {
            res.status(500).send(err);
        } else {
            res.send("Contato deletado");
        }
    });
});

app.put("/contatos/:id", (req, res) => {
    const id = req.params.id;
    const { nome, telefone, email } = req.body;

    db.run(
        "UPDATE contatos SET nome=?, telefone=?, email=? WHERE id=?",
        [nome, telefone, email, id],
        function(err) {
            if (err) {
                res.status(500).send(err);
            } else {
                res.send("Contato atualizado");
            }
        }
    );
});