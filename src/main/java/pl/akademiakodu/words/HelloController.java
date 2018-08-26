package pl.akademiakodu.words;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello() {

        return "hello";
    }

/*
    ModelMap to jest klasa w Springu , która służy do przekazywania danych
    ona jest Mapą
    Map<String,String> map = new HashMap<String,String>();
    map.put("hello","witaj");
    map.put("do widzenia","bye");
 */

    // obsługa ścieżki /givenword
    @GetMapping("/givenword")
    public String showResult(
            @RequestParam String word,
            ModelMap map
    ) {
        System.out.println("Kontrola Hello");
        //System.out.println("Podane słowo to " + name + " a opis to " + meaning);
        //String word = "word";
        GivenWord newword = new GivenWord(word);

        //map.put("result", product);
        //map.get("result");
        map.put("newword", word);
        map.get("newword");

        // result
        // oznacza, że Java ma wyświetlić plik resources/templates/display
        return "givenword";

    }

}

