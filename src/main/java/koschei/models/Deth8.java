package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Deth8 {
    private Needle7 needle;

    @Override
    public String toString() {
        return "в игле смерть " + needle.toString();
    }

    @Autowired
    public Deth8(Needle7 needle) {
        this.needle = needle;
    }
}
