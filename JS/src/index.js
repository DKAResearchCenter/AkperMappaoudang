import path from "path";

import DKA from "dkaframework";
import Controller from "./Controller";

new DKA.Server({
    serverEnabled : true,
    serverEngine : DKA.Server.FASTIFY_CORE_ENGINE,
    serverState : DKA.Server.SERVER_STATE_PRODUCTION,
    serverView : DKA.Server.VIEW_POV_EJS,
    serverHost : "localhost",
    serverPort : 8091,
    app : Controller,
    settings : {
        ngrok : {
            enabled : true,
            authToken : '1nztxzamrI1RRga7MSGhI46cP0R_4UqKZRbymsvc8L1dQUd9N'
        },
        localtunnel : false
    },
    options: {
        layoutDir: path.join(__dirname, "Layout"),
        assetsDir: path.join(__dirname, "Assets")
    }
});
