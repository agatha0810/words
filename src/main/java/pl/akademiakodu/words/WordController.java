package pl.akademiakodu.words;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WordController {

    @GetMapping("/addedword")
    public String addWord(){
        return "addedword";
        // w pliku user.html w templatees
        // będziemy mieć formularz do dodawania użytkownika
    }


    @PostMapping("/addedword")
    public String show(@RequestParam String meaning,
                       @RequestParam String onyomi,
                       @RequestParam String kunyomi,
                       ModelMap map){
        System.out.println("Kontrola Word");

        // tworzymy obiekt z danym z formularza
        //GivenWord givenword = new GivenWord(meaning, onyomi, kunyomi);
        GivenWord givenword = new GivenWord(meaning);

        // przekazanie zmiennej givenword z konstruktora jednoargumentowego do widoku html
        map.put("givenword",meaning);
        map.get("givenword");

        /*
        map.put("meaning",null); // przekazanie zmiennej user do widoku html
        map.get("meaning"); // przekazanie zmiennej user do widoku html
        map.put("onyomi",null); // przekazanie zmiennej user do widoku html
        map.get("onyomi"); // przekazanie zmiennej user do widoku html
        map.put("kunyomi",null); // przekazanie zmiennej user do widoku html
        map.get("kunyomi"); // przekazanie zmiennej user do widoku html
        */

        return "addedword"; // zwraca plik html:
        // resources/templates/addedword.html

    }

}