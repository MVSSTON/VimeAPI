package me.mstn.vimeworld.api.utility;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DateUtility {

    private final long VIME_EPOCH = 1546300800;

    public long matchDate(long timestamp) {
        return ((VIME_EPOCH - timestamp) * 1000) << 22;
    }

}
