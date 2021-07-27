/*
    Lo ideal es borrar antes los datos que contiene la base de datos.
*/

const { exec } = require("child_process");

exec("mongoimport --db vscode --collection tlds --headerline --file /workspaces/L2-Test-main/data/ok.csv --type csv", (error, stdout, stderr) => {
    if (error) {
        console.log(`error: ${error.message}`);
        return;
    }
    if (stderr) {
        console.log(`stderr: ${stderr}`);
        return;
    }
    console.log(`stdout: ${stdout}`);
});

