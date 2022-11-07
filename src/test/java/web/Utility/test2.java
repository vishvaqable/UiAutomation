package web.Utility;
import io.javalin.Javalin;
public class test2 {
        public static void main(String[] args) {Javalin app = Javalin.create(/*config*/)
                    .get("/QAble", ctx -> ctx.result("hi Qable i am feeling good"))
                    .start(8080);
        }
    }

