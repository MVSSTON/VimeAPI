package me.mstn.vimeworld.api.utility;

import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class StringUtility {

    public String sort(List<String> list, String delimiter) {
        return String.join(delimiter, list);
    }

    public String sortInteger(List<Integer> list, String delimiter) {
        return list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(delimiter));
    }

}
