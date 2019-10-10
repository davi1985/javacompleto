package course.map.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        //Map<Key, Value>
        Map<String, String> cookies = new TreeMap<>();

        //put() método para inserir
        cookies.put("username", "davisilva");
        cookies.put("email", "dssilvap@hotmail.com");
        cookies.put("phone", "88 8888 8888");

        //remove() informando uma chave
        cookies.remove("email");

        //map não admite repetição de key, ele sobrescreve o valor
        cookies.put("phone", "88 8888 7777");

        //containsKey()
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

        //pegando valor da key
        System.out.println("Phone number: " + cookies.get("phone"));

        //quando o elemento não existe - retorna 'null'
        System.out.println("Email: " + cookies.get("email"));

        //size()
        System.out.println("Size: " + cookies.size());

        //imprimir o Map
        System.out.println("All Cookies:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
