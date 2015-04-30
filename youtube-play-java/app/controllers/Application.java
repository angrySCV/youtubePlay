package controllers;

import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

    public static Result index() {
//        Logger.info("hello from app");
Logger.warn("warning message");
        return ok(index.render("new message"));

    }

}
