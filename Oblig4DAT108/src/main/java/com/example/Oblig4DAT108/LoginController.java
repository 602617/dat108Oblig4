package com.example.Oblig4DAT108;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import util.Log_inn;



@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping
    public String visSkjema() {
        return "login";
    }

    @PostMapping
    public String loggInn(@RequestParam String passord, HttpServletRequest request, RedirectAttributes ra, String mobiltelefon) {
        if(passord == null || !passord.equals("123")) {
            ra.addFlashAttribute("redirectMessage", "Feil passord eller telefonnummer");
        if(mobiltelefon == null || !mobiltelefon.equals("92694282")) {
            ra.addFlashAttribute("redirectMessage", "Feil passord eller telefonnummer");
        }
            return "redirect:login";
        }
        Log_inn.loggInnBruker(request, passord);
        return "redirect:paamelding";

    }

}

