

const Controller = async (app, opts, next) => {

    await app.get("/", (request, response) => {
        response.view("index");
    });

    await app.get("/1", (request, response) => {
        response.view("index-1");
    });

    await app.get("/mahasiswamendaftar", (request, response) => {
        response.view("daftar-mahasiswa");
    });

    await next();
};

export default Controller;