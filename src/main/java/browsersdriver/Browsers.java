package browsersdriver;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Browsers {
    chromeBrowser("chrome"),
    firefoxBrowser("firefox");

    @Getter
    private final String name;
}
