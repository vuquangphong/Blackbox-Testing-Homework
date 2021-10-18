public class VuQuangPhong {

    public static boolean isDate(int day, int month) {
        if (day < 0 || day > 31 || month < 0 || month > 12) {
            return false;
        }
        switch (month) {
            case 2:

//                code cũ
//                if (day > 28) {
//                    return false;
//                }

                if (day > 29) {
                    return false;
                }
                break;

            case 4: case 6: case 9: case 11:
                if (day > 30) {
                    return false;
                }

            default:
                break;
        }
        return true;
    }

}
