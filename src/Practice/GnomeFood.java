package Practice;

import java.util.HashMap;

public class GnomeFood {
    public int[] find(int[] gnames, int[] portions) {

        int arrayLength = gnames.length;
        int[] res = new int[arrayLength];
        HashMap hashMap = new HashMap();
        int gnamesMax = 0;
        int portionsMax = 0;
        int portionsIndex = 0;

        for (int i = 0; i < arrayLength; i++) {

            if (gnames[i] > gnamesMax) {
                gnamesMax = gnames[i];
                gnames[i] = 0;
            }

            if (portions[i] == portionsMax) {
                portionsMax = portions[i];
                portionsIndex = i;
                gnames[i] = 0;
            }

        }
        hashMap.put(portionsIndex, gnamesMax);

return res;
    }

}