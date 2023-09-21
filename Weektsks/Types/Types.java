/**
 * Не стоит вмещать большие значения в меньший тип: byte(128) -> -128
 * По формуле Хартли: i = log2(n), где n - кол-во вариантов, i -> кол-во возможных битов
 * byte 	8 бит 	от -128 до 127
 * short 	16 бит 	от -32768 до 32767
 * char 	16 бит 	беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)
 * int 	    32 бит 	от -2147483648 до 2147483647
 * long 	64 бит 	от -9223372036854775808L до 9223372036854775807L
 */
public class App
{
    public static void main( String[] args )
    {
        // Byte
        System.out.println((byte)-128 + " " + (byte)127);

        // Short
        System.out.println((short)-32768 + " " + (short)32767);

        // Char - format UTF-16
        System.out.println((char)-32768 + " " + (char)32767);

        // Int - (по умолчанию)
        System.out.println(-2147483648 + " " + 2147483647);

        // Long: L
        System.out.println(-9223372036854775808L + " " + 9223372036854775807L);

        // 127
        System.out.println((byte)1272312L);
    }
}
