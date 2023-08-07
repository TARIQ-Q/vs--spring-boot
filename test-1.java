/* To use this snippet, create a new class and insert this snippet at the beginning of the new class */
@Controller
@RequestMapping("/controller-name")
public class MyController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}