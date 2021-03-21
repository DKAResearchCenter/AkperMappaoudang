const DKA = require("dkaframework");

new DKA.Server({
    app: async (app, opts, next) => {

        next();
    }
});
