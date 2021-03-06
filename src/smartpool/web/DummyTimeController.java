package smartpool.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import smartpool.service.DummyTimeService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DummyTimeController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        String time = (new DummyTimeService()).getTime();

        return new ModelAndView("hello", "time", time);
    }
}