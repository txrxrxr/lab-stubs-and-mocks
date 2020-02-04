package util;

public class StringProcessor {
    public String capitalizeName (String name) {
        String[] nameList = name.split(" ");
        String resultName = "";

        for (String n: nameList)
        {
            resultName = resultName + n.substring(0, 1).toUpperCase() + n.substring(1).toLowerCase();
            resultName += " ";
        }
        return  resultName.trim();
    }


}
