// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            grrrrr, rrgrgr

public class llpppp
{

    private static final String b041304130413041304130413_java_lang_String_static_fld = "\u0204\u0203\u0211\u01CF\u0205\u0203";
    public static int b041304130413041304130413_int_static_fld = 0;
    private static final String b041304130413041304130413_java_lang_String_static_fld = "\uFECF\uFEDE\uFED1\uFECD\uFEE0\uFED1\uFEAC\uFEE0\uFECD\uFECE\uFED8\uFED1\uFEAC\uFF00\uFEEE\uFEF8\uFEEB\uFEF0\uFEED\uFF00\uFEED\uFEEB\uFEF3\uFEFE\uFEFB\uFF01\uFEFC\uFEB4\uFEEB\uFEF5\uFEF0\uFEAC\uFED5\uFEDA\uFEE0\uFED1\uFED3\uFED1\uFEDE\uFEAC\uFEDA\uFEDB\uFEE0\uFEAC\uFEDA\uFEE1\uFED8\uFED8\uFEAC\uFEDC\uFEDE\uFED5\uFED9\uFECD\uFEDE\uFEE5\uFEAC\uFED7\uFED1\uFEE5\uFEAC\uFECD\uFEE1\uFEE0\uFEDB\uFED5\uFEDA\uFECF\uFEDE\uFED1\uFED9\uFED1\uFEDA\uFEE0\uFEB8\uFEAC\uFF00\uFEFB\uFEF7\uFEF1\uFEFA\uFEEB\uFEF7\uFEF1\uFF05\uFEAC\uFED5\uFEDA\uFEE0\uFED1\uFED3\uFED1\uFEDE\uFEB8\uFEAC\uFEF0\uFEF3\uFEF5\uFEAC\uFEE0\uFED1\uFEE4\uFEE0\uFEAC\uFEDA\uFEDB\uFEE0\uFEAC\uFEDA\uFEE1\uFED8\uFED8\uFEB8\uFEAC\uFEF0\uFEF3\uFEF5\uFEEB\uFEF0\uFEED\uFF00\uFEED\uFEAC\uFECE\uFED8\uFEDB\uFECE\uFEAC\uFEDA\uFEDB\uFEE0\uFEAC\uFEDA\uFEE1\uFED8\uFED8\uFEB8\uFEAC\uFED2\uFEDB\uFEDE\uFED1\uFED5\uFED3\uFEDA\uFEAC\uFED7\uFED1\uFEE5\uFEB4\uFF00\uFEFB\uFEF7\uFEF1\uFEFA\uFEEB\uFEF7\uFEF1\uFF05\uFEB5\uFEAC\uFEDE\uFED1\uFED2\uFED1\uFEDE\uFED1\uFEDA\uFECF\uFED1\uFEDF\uFEAC\uFF00\uFEEE\uFEF8\uFEEB\uFF00\uFEFB\uFEF7\uFEF1\uFEFA\uFEEB\uFEF5\uFEFA\uFEF2\uFEFB\uFEAC\uFEB4\uFEEB\uFEF5\uFEF0\uFEB5\uFEAC\uFEDB\uFEDA\uFEAC\uFED0\uFED1\uFED8\uFED1\uFEE0\uFED1\uFEAC\uFECF\uFECD\uFEDF\uFECF\uFECD\uFED0\uFED1\uFEB8\uFEAC\uFEE1\uFEDA\uFED5\uFEDD\uFEE1\uFED1\uFEAC\uFEB4\uFF00\uFEFB\uFEF7\uFEF1\uFEFA\uFEEB\uFEF7\uFEF1\uFF05\uFEB8\uFEF0\uFEF3\uFEF5\uFEB5\uFEAC\uFEDB\uFEDA\uFEAC\uFECF\uFEDB\uFEDA\uFED2\uFED8\uFED5\uFECF\uFEE0\uFEAC\uFEDE\uFED1\uFEDC\uFED8\uFECD\uFECF\uFED1\uFEB5\uFEC7";
    private static final String b041304130413041304130413_java_lang_String_static_fld;
    public static int b041304130413041304130413_int_static_fld = 1;
    private static final String b041304130413041304130413_java_lang_String_static_fld = "\u012E\u013D\u0130\u012C\u013F\u0130\u010B\u013F\u012C\u012D\u0137\u0130\u010B\u015F\u014D\u0157\u014A\u015F\u015A\u0156\u0150\u0159\u014A\u0154\u0159\u0151\u015A\u010B\u0113\u014A\u0154\u014F\u010B\u0134\u0139\u013F\u0130\u0132\u0130\u013D\u010B\u013B\u013D\u0134\u0138\u012C\u013D\u0144\u010B\u0136\u0130\u0144\u010B\u012C\u0140\u013F\u013A\u0134\u0139\u012E\u013D\u0130\u0138\u0130\u0139\u013F\u0117\u010B\u015B\u014C\u0159\u014A\u015D\u0150\u0151\u0150\u015D\u0150\u0159\u014E\u0150\u014A\u0154\u014F\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u015F\u015A\u0156\u0150\u0159\u014A\u015D\u0150\u015C\u0160\u0150\u015E\u015F\u0150\u015D\u014A\u0154\u014F\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u015F\u015A\u0156\u0150\u0159\u014A\u015D\u0150\u0151\u0150\u015D\u0150\u0159\u014E\u0150\u014A\u0154\u014F\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u015B\u015D\u0150\u015E\u0150\u0159\u015F\u014C\u015F\u0154\u015A\u0159\u014A\u015F\u0164\u015B\u0150\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u015E\u015F\u015A\u015D\u014C\u0152\u0150\u014A\u015F\u0164\u015B\u0150\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u014C\u015B\u015B\u014A\u015B\u015D\u0152\u015D\u0158\u014A\u0154\u014F\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u0157\u014C\u0159\u0152\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u0150\u0163\u015B\u0154\u015D\u014C\u015F\u0154\u015A\u0159\u014A\u0158\u015A\u0159\u015F\u0153\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u0150\u0163\u015B\u0154\u015D\u014C\u015F\u0154\u015A\u0159\u014A\u0164\u0150\u014C\u015D\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u015E\u015F\u014C\u015F\u0154\u014E\u014A\u015B\u014C\u015D\u014C\u0158\u015E\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u014F\u0164\u0159\u014C\u0158\u0154\u014E\u014A\u0156\u0150\u0164\u010B\u012D\u0137\u013A\u012D\u0117\u010B\u0158\u014C\u014E\u014A\u0157\u0150\u0151\u015F\u014A\u0156\u0150\u0164\u010B\u012D\u0137\u013A\u012D\u0117\u010B\u0158\u014C\u014E\u014A\u015D\u0154\u0152\u0153\u015F\u014A\u0156\u0150\u0164\u010B\u012D\u0137\u013A\u012D\u0117\u010B\u014F\u0164\u0159\u014C\u0158\u0154\u014E\u014A\u014F\u0156\u0154\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u014F\u0164\u0159\u014C\u0158\u0154\u014E\u014A\u015E\u015F\u014C\u015F\u0160\u015E\u014A\u015E\u015F\u014C\u015F\u0160\u015E\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u014F\u0164\u0159\u014C\u0158\u0154\u014E\u014A\u015E\u015F\u014C\u015F\u0160\u015E\u014A\u015D\u0150\u014C\u015E\u015A\u0159\u014A\u014E\u015A\u014F\u0150\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u014F\u0164\u0159\u014C\u0158\u0154\u014E\u014A\u015E\u015F\u014C\u015F\u0160\u015E\u014A\u015D\u0150\u014C\u015E\u015A\u0159\u014A\u015E\u015F\u014C\u015F\u0160\u015E\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u015F\u015A\u0156\u0150\u0159\u014A\u015E\u015F\u014C\u015F\u0160\u015E\u014A\u015E\u015F\u014C\u015F\u0160\u015E\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u015F\u015A\u0156\u0150\u0159\u014A\u015E\u015F\u014C\u015F\u0160\u015E\u014A\u015D\u0150\u014C\u015E\u015A\u0159\u014A\u014E\u015A\u014F\u0150\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u015F\u015A\u0156\u0150\u0159\u014A\u015E\u015F\u014C\u015F\u0160\u015E\u014A\u015D\u0150\u014C\u015E\u015A\u0159\u014A\u015E\u015F\u014C\u015F\u0160\u015E\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u0157\u014C\u015E\u015F\u014A\u0151\u015A\u0160\u015D\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u014E\u014C\u015D\u014F\u014A\u014C\u015D\u015F\u014A\u0160\u015D\u0154\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u014E\u014C\u015D\u014F\u014A\u015D\u0150\u0151\u014A\u0154\u014F\u010B\u013F\u0130\u0143\u013F\u0117\u010B\u0159\u0154\u014E\u010B\u0134\u0139\u013F\u0130\u0132\u0130\u013D\u0117\u010B\u0157\u015A\u014E\u014C\u015F\u0150\u014A\u015E\u014C\u014F\u014A\u015A\u0151\u0151\u015E\u0150\u015F\u010B\u0134\u0139\u013F\u0130\u0132\u0130\u013D\u0117\u010B\u015E\u014F\u014C\u014F\u014A\u015E\u0151\u0154\u010B\u0134\u0139\u013F\u0130\u0132\u0130\u013D\u0117\u010B\u015E\u014F\u014C\u014F\u014A\u015D\u0150\u014E\u010B\u0134\u0139\u013F\u0130\u0132\u0130\u013D\u0117\u010B\u015E\u014F\u014C\u014F\u014A\u015A\u0151\u0151\u015E\u0150\u015F\u010B\u0134\u0139\u013F\u0130\u0132\u0130\u013D\u0117\u010B\u015E\u014F\u014C\u014F\u014A\u0157\u0150\u0159\u0152\u015F\u0153\u010B\u0134\u0139\u013F\u0130\u0132\u0130\u013D\u0117\u010B\u014E\u014C\u015D\u014A\u014F\u014C\u015F\u014C\u014A\u015A\u0151\u0151\u015E\u0150\u015F\u010B\u0134\u0139\u013F\u0130\u0132\u0130\u013D\u0117\u010B\u014F\u0150\u014E\u0154\u0158\u014C\u0157\u0154\u0165\u0150\u014F\u014A\u014E\u015D\u0164\u015B\u015F\u015A\u014A\u014F\u014C\u015F\u014C\u010B\u012D\u0137\u013A\u012D\u0117\u010B\u014D\u015A\u0160\u0159\u014E\u0164\u014A\u015E\u0160\u014D\u0158\u014C\u015D\u0154\u0159\u0150\u010B\u012D\u0137\u013A\u012D\u0117\u010B\u0140\u0139\u0134\u013C\u0140\u0130\u010B\u0113\u015F\u015A\u0156\u0150\u0159\u014A\u015D\u0150\u015C\u0160\u0150\u015E\u015F\u0150\u015D\u014A\u0154\u014F\u0117\u015F\u015A\u0156\u0150\u0159\u014A\u015D\u0150\u0151\u0150\u015D\u0150\u0159\u014E\u0150\u014A\u0154\u014F\u0114\u010B\u013A\u0139\u010B\u012E\u013A\u0139\u0131\u0137\u0134\u012E\u013F\u010B\u0131\u012C\u0134\u0137\u0114\u0126";
    private static final int b041304130413041304130413_int_static_fld = -1;
    private static final String b041304130413041304130413_java_lang_String_static_fld = "\u01C4\u01C6\u01B5\u01BB\u01C1\u01B5\u0194\u01DA\u01E3\u01E6\u01D9\u01DD\u01DB\u01E2\u01D3\u01DF\u01D9\u01ED\u01E7\u01B1\u01C3\u01C2\u01AF";
    public static int b041304130413041304130413_int_static_fld = 2;
    private static final String b041304130413041304130413_java_lang_String_static_fld = "\225\244\227\223\246\227r\246\223\224\236\227r\306\264\276\261\305\267\306\306\273\300\271\305rz\261\273\266r\233\240\246\227\231\227\244r\242\244\233\237\223\244\253r\235\227\253~r\263\265\265\267\305\305\261\306\301\275\267\300\261\263\266\310\261\311\263\304\300\273\300\271\261\302\267\304\265\267\300\306r\233\240\246\227\231\227\244~r\263\265\265\267\305\305\261\306\301\275\267\300\261\263\266\310\261\311\263\304\300\273\300\271\261\306\273\277\267r\233\240\246\227\231\227\244~r\265\272\267\265\275\261\305\306\263\306\307\305\261\302\267\304\273\301\266r\233\240\246\227\231\227\244~r\305\267\276\267\265\306\261\265\263\304\266r\233\240\246\227\231\227\244~r\265\310\277\261\267\300\306\273\306\313r\246\227\252\246~r\265\310\277\261\306\313\302\267r\246\227\252\246~r\265\310\277\261\310\267\304\273\270\273\267\266r\233\240\246\227\231\227\244~r\267\300\266\261\302\301\273\300\306r\246\227\252\246~r\267\300\310\273\304\301\300\277\267\300\306r\246\227\252\246~r\306\272\277\261\267\300\263\264\276\267\266r\233\240\246\227\231\227\244~r\264\301\307\300\265\313\261\263\273\304\302\276\263\300\267r\224\236\241\224~r\277\263\312\261\306\310\276r\233\240\246\227\231\227\244r\226\227\230\223\247\236\246r\207\202{\215";
    private static final String b041304130413041304130413_java_lang_String_static_fld = "\uFF8C\uFF9B\uFF8E\uFF8A\uFF9D\uFF8E\uFF69\uFF9D\uFF9B\uFF92\uFF90\uFF90\uFF8E\uFF9B\uFF69\uFFBE\uFFB9\uFFAD\uFFAA\uFFBD\uFFAE\uFFA8\uFFBC\uFFAE\uFFB5\uFFAE\uFFAC\uFFBD\uFFAE\uFFAD\uFFA8\uFFAC\uFFAA\uFFBB\uFFAD\uFFA8\uFFB8\uFFB7\uFFA8\uFFAD\uFFAE\uFFB5\uFFAE\uFFBD\uFFAE\uFF69\uFF8B\uFF8E\uFF8F\uFF98\uFF9B\uFF8E\uFF69\uFF8D\uFF8E\uFF95\uFF8E\uFF9D\uFF8E\uFF69\uFF98\uFF97\uFF69\uFFBD\uFFAB\uFFB5\uFFA8\uFFBD\uFFB8\uFFB4\uFFAE\uFFB7\uFFA8\uFFB2\uFFB7\uFFAF\uFFB8\uFF69\uFF8B\uFF8E\uFF90\uFF92\uFF97\uFF69\uFF9E\uFF99\uFF8D\uFF8A\uFF9D\uFF8E\uFF69\uFFBD\uFFAB\uFFB5\uFFA8\uFFBC\uFFAE\uFFBD\uFFBD\uFFB2\uFFB7\uFFB0\uFFBC\uFF69\uFF9C\uFF8E\uFF9D\uFF69\uFFBC\uFFAE\uFFB5\uFFAE\uFFAC\uFFBD\uFFA8\uFFAC\uFFAA\uFFBB\uFFAD\uFF86\uFF76\uFF7A\uFF69\uFFA0\uFF91\uFF8E\uFF9B\uFF8E\uFF69\uFFBC\uFFAE\uFFB5\uFFAE\uFFAC\uFFBD\uFFA8\uFFAC\uFFAA\uFFBB\uFFAD\uFF69\uFF86\uFF69\uFFB8\uFFB5\uFFAD\uFF77\uFFA8\uFFB2\uFFAD\uFF84\uFF69\uFF8E\uFF97\uFF8D\uFF84";
    private static final String b041304130413041304130413_java_lang_String_static_fld = "\323\342\325\321\344\325\260\344\321\322\334\325\260\u0104\362\374\357\u0104\u0106\374\260\270\357\371\364\260\331\336\344\325\327\325\342\260\340\342\331\335\321\342\351\260\333\325\351\260\321\345\344\337\331\336\323\342\325\335\325\336\344\274\260\u0104\377\373\365\376\357\373\365\u0109\260\331\336\344\325\327\325\342\274\260\u0104\371\375\365\u0103\u0104\361\375\u0100\260\336\345\335\325\342\331\323\274\260\u0105\376\u0100\u0102\365\364\371\363\u0104\361\362\374\365\357\376\u0105\375\362\365\u0102\260\344\325\350\344\274\260\361\u0104\363\260\331\336\344\325\327\325\342\274\260\u0104\u0102\361\376\u0103\361\363\u0104\371\377\376\357\u0104\u0109\u0100\365\260\344\325\350\344\274\260\361\u0100\371\260\344\325\350\344\274\260\363\u0102\u0109\u0100\u0104\377\367\u0102\361\375\260\344\325\350\344\274\260\326\337\342\325\331\327\336\260\333\325\351\270\u0104\377\373\365\376\357\373\365\u0109\271\260\342\325\326\325\342\325\336\323\325\343\260\u0104\362\374\357\u0104\377\373\365\376\357\371\376\366\377\260\270\357\371\364\271\260\337\336\260\324\325\334\325\344\325\260\323\321\343\323\321\324\325\260\271\313";
    public static int b041304130413041304130413_int_static_fld = 51;
    private static final int b041304130413041304130413_int_static_fld = 1;
    private final SQLiteDatabase b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;

    public llpppp(Context context)
    {
        int i = b041304130413041304130413_int_static_fld;
        switch ((i * (b041304130413041304130413_int_static_fld + i)) % b041304130413041304130413_int_static_fld)
        {
        default:
            Object obj = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("\204\u04F3\326\322\327\323\u04F3\326\322\327\323\u04F3\326\322\327\323\326\322\327\323", '\346', '\002'), new Class[0]);
            int j;
            int k;
            int l;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b041304130413041304130413_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("\u02A2\u0655\u0270\u0274\u0271\u0275\u0655\u0270\u0274\u0271\u0275\u0655\u0270\u0274\u0271\u0275\u0270\u0274\u0271\u0275", '\300', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b041304130413041304130413_int_static_fld = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            j = b041304130413041304130413_int_static_fld;
            k = b041304130413041304130413_int_static_fld;
            l = b041304130413041304130413_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        (j * (k + j)) % l;
        JVM INSTR tableswitch 0 0: default 152
    //                   0 198;
           goto _L1 _L2
_L1:
        try
        {
            b041304130413041304130413_int_static_fld = 46;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        obj = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("\uFD95\u0148\uFD63\uFD67\uFD64\uFD68\u0148\uFD63\uFD67\uFD64\uFD68\u0148\uFD63\uFD67\uFD64\uFD68\uFD63\uFD67\uFD64\uFD68", '\357', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        b041304130413041304130413_int_static_fld = j;
_L2:
        try
        {
            this(context, 1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
        context;
        throw context.getCause();
    }

    public llpppp(Context context, int i)
    {
label0:
        do
        {
            if (((b041304130413041304130413_int_static_fld + b041304130413041304130413_int_static_fld) * b041304130413041304130413_int_static_fld) % b041304130413041304130413_int_static_fld != b041304130413041304130413_int_static_fld)
            {
                Object obj = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("\u0153\u0506\u0121\u0125\u0122\u0126\u0506\u0121\u0125\u0122\u0126\u0506\u0121\u0125\u0122\u0126\u0121\u0125\u0122\u0126", '\361', '\005'), new Class[0]);
                Method method;
                int j;
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context.getCause();
                }
                b041304130413041304130413_int_static_fld = ((Integer)obj).intValue();
                b041304130413041304130413_int_static_fld = 75;
            }
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        super();
        obj = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("\207\u043AUYVZ\u043AUYVZ\u043AUYVZUYVZ", '%', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context.getCause();
        }
        j = ((Integer)obj).intValue();
        switch ((j * (b041304130413041304130413_int_static_fld + j)) % b041304130413041304130413_int_static_fld)
        {
        default:
            obj = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("\u01D3\u0586\u01A1\u01A5\u01A2\u01A6\u0586\u01A1\u01A5\u01A2\u01A6\u0586\u01A1\u01A5\u01A2\u01A6\u01A1\u01A5\u01A2\u01A6", '{', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b041304130413041304130413_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD2\u0385\uFFA0\uFFA4\uFFA1\uFFA5\u0385\uFFA0\uFFA4\uFFA1\uFFA5\u0385\uFFA0\uFFA4\uFFA1\uFFA5\uFFA0\uFFA4\uFFA1\uFFA5", '\330', 'H', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b041304130413041304130413_int_static_fld = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            obj = grrrrr.b044C044C044C044C044C044C("\uFFBF\uFFBE\uFFCC\uFF8A\uFFC0\uFFBE", '\244', '\0');
            method = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u015C\u012A\u012E\u012C\u013C\u012A\u012E\u012C\u013C\u0525\u012A\u012E\u012C\u013C\u012A\u012E\u012C\u013C\u0525", '\001', '\371', '\003'), new Class[] {
                android/content/Context, java/lang/String, android/database/sqlite/SQLiteDatabase$CursorFactory, Integer.TYPE
            });
            break;
        }
        try
        {
            context = ((Context) (method.invoke(null, new Object[] {
                context, obj, null, Integer.valueOf(i)
            })));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context.getCause();
        }
        context = (rrgrgr)context;
label1:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label1;

                    case 1: // '\001'
                        break label1;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label1;
            }
        } while (true);
        obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u01CF\u01CD\u01DC\u01BF\u01DA\u01D1\u01DC\u01C9\u01CA\u01D4\u01CD\u01AC\u01C9\u01DC\u01C9\u01CA\u01C9\u01DB\u01CD", 'x', '\006'), new Class[0]);
        try
        {
            context = ((Context) (((Method) (obj)).invoke(context, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context.getCause();
        }
        b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld = (SQLiteDatabase)context;
    }

    public static int b0415041504150415041504150415()
    {
        return 18;
    }

    public static String b0415041504150415041504150415()
    {
        int i;
        int j;
        try
        {
            i = b041304130413041304130413_int_static_fld;
            j = b041304130413041304130413_int_static_fld;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((b041304130413041304130413_int_static_fld + b041304130413041304130413_int_static_fld) * b041304130413041304130413_int_static_fld) % b041304130413041304130413_int_static_fld != b041304130413041304130413_int_static_fld)
        {
            Object obj = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("\034\u03CF\uFFEA\uFFEE\uFFEB\uFFEF\u03CF\uFFEA\uFFEE\uFFEB\uFFEF\u03CF\uFFEA\uFFEE\uFFEB\uFFEF\uFFEA\uFFEE\uFFEB\uFFEF", '#', '\003'), new Class[0]);
            Object obj1;
            int k;
            int l;
            int i1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041304130413041304130413_int_static_fld = ((Integer)obj).intValue();
            b041304130413041304130413_int_static_fld = 25;
        }
        k = b041304130413041304130413_int_static_fld;
        l = b041304130413041304130413_int_static_fld;
        i1 = b041304130413041304130413_int_static_fld;
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        try
        {
            b041304130413041304130413_int_static_fld = 21;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        obj = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("\253\u045Ey}z~\u045Ey}z~\u045Ey}z~y}z~", '\200', '7', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041304130413041304130413_int_static_fld = i;
        obj = b041304130413041304130413_java_lang_String_static_fld;
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        return ((String) (obj));
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    public void b0415041504150415041504150415()
    {
        rrrrrr/llpppp;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        String s;
        sqlitedatabase = b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;
        s = grrrrr.b044C044C044C044C044C044C("\uFD9B\uFDA9\uFDA6\uFDA7\uFD77\uFDAB\uFD98\uFD99\uFDA3\uFD9C\uFD77\uFDA0\uFD9D\uFD77\uFD9C\uFDAF\uFDA0\uFDAA\uFDAB\uFDAA\uFD77\uFDCB\uFDB9\uFDC3\uFDB6\uFDCB\uFDC6\uFDC2\uFDBC\uFDC5\uFDB6\uFDC0\uFDC5\uFDBD\uFDC6", '\343', '\004');
        Method method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\271\314\271\267\247\245\240", '\034', '\006'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            s
        });
        sqlitedatabase = b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;
        s = grrrrr.b044C044C044C044C044C044C("\274\312\307\310\230\314\271\272\304\275\230\301\276\230\275\320\301\313\314\313\230\354\332\344\327\353\335\354\354\341\346\337\353", 'x', '\005');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\245\270\245\243\223\221\214", '@', '\005'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            s
        });
        sqlitedatabase = b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;
        s = grrrrr.b044C044C044C044C044C044C("\uFD9B\uFDA9\uFDA6\uFDA7\uFD77\uFDAB\uFD98\uFD99\uFDA3\uFD9C\uFD77\uFDA0\uFD9D\uFD77\uFD9C\uFDAF\uFDA0\uFDAA\uFDAB\uFDAA\uFD77\uFDCB\uFDB9\uFDC3\uFDB6\uFDBB\uFDB8\uFDCB\uFDB8\uFDB6\uFDBE\uFDC9\uFDC6\uFDCC\uFDC7", '\343', '\004');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\363\u0106\363\361\341\337\332", 'G', '\001'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            s
        });
        sqlitedatabase = b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;
        s = grrrrr.b044C044C044C044C044C044C("\u0124\u0132\u012F\u0130\u0100\u0134\u0121\u0122\u012C\u0125\u0100\u0129\u0126\u0100\u0125\u0138\u0129\u0133\u0134\u0133\u0100\u0154\u0142\u014C\u013F\u0154\u0156\u014C", '\340', '\005');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\uFF1D\uFF30\uFF1D\uFF1B\uFF0B\uFF09\uFF04", '\267', '\221', '\0'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            s
        });
        sqlitedatabase = b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;
        s = grrrrr.b044C044C044C044C044C044C("\uFFE8\uFFF6\uFFF3\uFFF4\uFFC4\uFFF8\uFFF6\uFFED\uFFEB\uFFEB\uFFE9\uFFF6\uFFC4\uFFED\uFFEA\uFFC4\uFFE9\uFFFC\uFFED\uFFF7\uFFF8\uFFF7\uFFC4\031\024\b\005\030\t\003\027\t\020\t\007\030\t\b\003\007\005\026\b\003\023\022\003\b\t\020\t\030\t", '\t', 'e', '\002');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("ViVTDB=", '\005', '\004'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            s
        });
        sqlitedatabase = b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;
        s = grrrrr.b044C044C044C044C044C044C("\u015D\u016C\u015F\u015B\u016E\u015F\u013A\u016E\u015B\u015C\u0166\u015F\u013A\u018E\u017C\u0186\u0179\u018E\u0189\u0185\u017F\u0188\u0179\u0183\u0188\u0180\u0189\u013A\u0142\u0179\u0183\u017E\u013A\u0163\u0168\u016E\u015F\u0161\u015F\u016C\u013A\u016A\u016C\u0163\u0167\u015B\u016C\u0173\u013A\u0165\u015F\u0173\u013A\u015B\u016F\u016E\u0169\u0163\u0168\u015D\u016C\u015F\u0167\u015F\u0168\u016E\u0146\u013A\u018A\u017B\u0188\u0179\u018C\u017F\u0180\u017F\u018C\u017F\u0188\u017D\u017F\u0179\u0183\u017E\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u018E\u0189\u0185\u017F\u0188\u0179\u018C\u017F\u018B\u018F\u017F\u018D\u018E\u017F\u018C\u0179\u0183\u017E\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u018E\u0189\u0185\u017F\u0188\u0179\u018C\u017F\u0180\u017F\u018C\u017F\u0188\u017D\u017F\u0179\u0183\u017E\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u018A\u018C\u017F\u018D\u017F\u0188\u018E\u017B\u018E\u0183\u0189\u0188\u0179\u018E\u0193\u018A\u017F\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u018D\u018E\u0189\u018C\u017B\u0181\u017F\u0179\u018E\u0193\u018A\u017F\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u017B\u018A\u018A\u0179\u018A\u018C\u0181\u018C\u0187\u0179\u0183\u017E\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u0186\u017B\u0188\u0181\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u017F\u0192\u018A\u0183\u018C\u017B\u018E\u0183\u0189\u0188\u0179\u0187\u0189\u0188\u018E\u0182\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u017F\u0192\u018A\u0183\u018C\u017B\u018E\u0183\u0189\u0188\u0179\u0193\u017F\u017B\u018C\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u018D\u018E\u017B\u018E\u0183\u017D\u0179\u018A\u017B\u018C\u017B\u0187\u018D\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u017E\u0193\u0188\u017B\u0187\u0183\u017D\u0179\u0185\u017F\u0193\u013A\u015C\u0166\u0169\u015C\u0146\u013A\u0187\u017B\u017D\u0179\u0186\u017F\u0180\u018E\u0179\u0185\u017F\u0193\u013A\u015C\u0166\u0169\u015C\u0146\u013A\u0187\u017B\u017D\u0179\u018C\u0183\u0181\u0182\u018E\u0179\u0185\u017F\u0193\u013A\u015C\u0166\u0169\u015C\u0146\u013A\u017E\u0193\u0188\u017B\u0187\u0183\u017D\u0179\u017E\u0185\u0183\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u017E\u0193\u0188\u017B\u0187\u0183\u017D\u0179\u018D\u018E\u017B\u018E\u018F\u018D\u0179\u018D\u018E\u017B\u018E\u018F\u018D\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u017E\u0193\u0188\u017B\u0187\u0183\u017D\u0179\u018D\u018E\u017B\u018E\u018F\u018D\u0179\u018C\u017F\u017B\u018D\u0189\u0188\u0179\u017D\u0189\u017E\u017F\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u017E\u0193\u0188\u017B\u0187\u0183\u017D\u0179\u018D\u018E\u017B\u018E\u018F\u018D\u0179\u018C\u017F\u017B\u018D\u0189\u0188\u0179\u018D\u018E\u017B\u018E\u018F\u018D\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u018E\u0189\u0185\u017F\u0188\u0179\u018D\u018E\u017B\u018E\u018F\u018D\u0179\u018D\u018E\u017B\u018E\u018F\u018D\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u018E\u0189\u0185\u017F\u0188\u0179\u018D\u018E\u017B\u018E\u018F\u018D\u0179\u018C\u017F\u017B\u018D\u0189\u0188\u0179\u017D\u0189\u017E\u017F\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u018E\u0189\u0185\u017F\u0188\u0179\u018D\u018E\u017B\u018E\u018F\u018D\u0179\u018C\u017F\u017B\u018D\u0189\u0188\u0179\u018D\u018E\u017B\u018E\u018F\u018D\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u0186\u017B\u018D\u018E\u0179\u0180\u0189\u018F\u018C\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u017D\u017B\u018C\u017E\u0179\u017B\u018C\u018E\u0179\u018F\u018C\u0183\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u017D\u017B\u018C\u017E\u0179\u018C\u017F\u0180\u0179\u0183\u017E\u013A\u016E\u015F\u0172\u016E\u0146\u013A\u0188\u0183\u017D\u013A\u0163\u0168\u016E\u015F\u0161\u015F\u016C\u0146\u013A\u0186\u0189\u017D\u017B\u018E\u017F\u0179\u018D\u017B\u017E\u0179\u0189\u0180\u0180\u018D\u017F\u018E\u013A\u0163\u0168\u016E\u015F\u0161\u015F\u016C\u0146\u013A\u018D\u017E\u017B\u017E\u0179\u018D\u0180\u0183\u013A\u0163\u0168\u016E\u015F\u0161\u015F\u016C\u0146\u013A\u018D\u017E\u017B\u017E\u0179\u018C\u017F\u017D\u013A\u0163\u0168\u016E\u015F\u0161\u015F\u016C\u0146\u013A\u018D\u017E\u017B\u017E\u0179\u0189\u0180\u0180\u018D\u017F\u018E\u013A\u0163\u0168\u016E\u015F\u0161\u015F\u016C\u0146\u013A\u018D\u017E\u017B\u017E\u0179\u0186\u017F\u0188\u0181\u018E\u0182\u013A\u0163\u0168\u016E\u015F\u0161\u015F\u016C\u0146\u013A\u017D\u017B\u018C\u0179\u017E\u017B\u018E\u017B\u0179\u0189\u0180\u0180\u018D\u017F\u018E\u013A\u0163\u0168\u016E\u015F\u0161\u015F\u016C\u0146\u013A\u017E\u017F\u017D\u0183\u0187\u017B\u0186\u0183\u0194\u017F\u017E\u0179\u017D\u018C\u0193\u018A\u018E\u0189\u0179\u017E\u017B\u018E\u017B\u013A\u015C\u0166\u0169\u015C\u0146\u013A\u017C\u0189\u018F\u0188\u017D\u0193\u0179\u018D\u018F\u017C\u0187\u017B\u018C\u0183\u0188\u017F\u013A\u015C\u0166\u0169\u015C\u0146\u013A\u016F\u0168\u0163\u016B\u016F\u015F\u013A\u0142\u018E\u0189\u0185\u017F\u0188\u0179\u018C\u017F\u018B\u018F\u017F\u018D\u018E\u017F\u018C\u0179\u0183\u017E\u0146\u018E\u0189\u0185\u017F\u0188\u0179\u018C\u017F\u0180\u017F\u018C\u017F\u0188\u017D\u017F\u0179\u0183\u017E\u0143\u013A\u0169\u0168\u013A\u015D\u0169\u0168\u0160\u0166\u0163\u015D\u016E\u013A\u0160\u015B\u0163\u0166\u0143\u0155", '^', '\006');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\u0169\u017C\u0169\u0167\u0157\u0155\u0150", '\243', 'a', '\003'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            s
        });
        sqlitedatabase = b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;
        s = grrrrr.b044C044C044C044C044C044C("BQD@SD\037S@AKD\037sak^c`s`^fqnto'^hc\037HMSDFDQ\037MNS\037MTKK\037OQHL@QX\037JDX\037@TSNHMBQDLDMS+\037snjdm^jdx\037HMSDFDQ+\037cfh\037SDWS\037MNS\037MTKK+\037cfh^c`s`\037AKNA\037MNS\037MTKK+\037ENQDHFM\037JDX'snjdm^jdx(\037QDEDQDMBDR\037sak^snjdm^hmen\037'^hc(\037NM\037CDKDSD\037B@RB@CD+\037TMHPTD\037'snjdm^jdx+cfh(\037NM\037BNMEKHBS\037QDOK@BD(:", ':', '9', '\001');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\uFF66\uFF79\uFF66\uFF64\uFF54\uFF52\uFF4D", '\217', 'p', '\0'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            s
        });
        sqlitedatabase = b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;
        s = grrrrr.b044C044C044C044C044C044C("\307\326\311\305\330\311\244\330\305\306\320\311\244\370\346\360\343\367\351\370\370\355\362\353\367\244\254\343\355\350\244\315\322\330\311\313\311\326\244\324\326\315\321\305\326\335\244\317\311\335\260\244\345\347\347\351\367\367\343\370\363\357\351\362\343\345\350\372\343\373\345\366\362\355\362\353\343\364\351\366\347\351\362\370\244\315\322\330\311\313\311\326\260\244\345\347\347\351\367\367\343\370\363\357\351\362\343\345\350\372\343\373\345\366\362\355\362\353\343\370\355\361\351\244\315\322\330\311\313\311\326\260\244\347\354\351\347\357\343\367\370\345\370\371\367\343\364\351\366\355\363\350\244\315\322\330\311\313\311\326\260\244\367\351\360\351\347\370\343\347\345\366\350\244\315\322\330\311\313\311\326\260\244\347\372\361\343\351\362\370\355\370\375\244\330\311\334\330\260\244\347\372\361\343\370\375\364\351\244\330\311\334\330\260\244\347\372\361\343\372\351\366\355\352\355\351\350\244\315\322\330\311\313\311\326\260\244\351\362\350\343\364\363\355\362\370\244\330\311\334\330\260\244\351\362\372\355\366\363\362\361\351\362\370\244\330\311\334\330\260\244\370\354\361\343\351\362\345\346\360\351\350\244\315\322\330\311\313\311\326\260\244\346\363\371\362\347\375\343\345\355\366\364\360\345\362\351\244\306\320\323\306\260\244\361\345\374\343\370\372\360\244\315\322\330\311\313\311\326\244\310\311\312\305\331\320\330\244\271\264\255\277", 'B', '\001');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\uFF14\uFF27\uFF14\uFF12\uFF02\uFF00\uFEFB", 'o', '\342', '\0'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            s
        });
        sqlitedatabase = b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;
        s = grrrrr.b044C044C044C044C044C044C("\uFF70\uFF7F\uFF72\uFF6E\uFF81\uFF72\uFF4D\uFF81\uFF6E\uFF6F\uFF79\uFF72\uFF4D\uFFA1\uFF8F\uFF99\uFF8C\uFFA1\uFFA3\uFF99\uFF4D\uFF55\uFF8C\uFF96\uFF91\uFF4D\uFF76\uFF7B\uFF81\uFF72\uFF74\uFF72\uFF7F\uFF4D\uFF7D\uFF7F\uFF76\uFF7A\uFF6E\uFF7F\uFF86\uFF4D\uFF78\uFF72\uFF86\uFF4D\uFF6E\uFF82\uFF81\uFF7C\uFF76\uFF7B\uFF70\uFF7F\uFF72\uFF7A\uFF72\uFF7B\uFF81\uFF59\uFF4D\uFFA1\uFF9C\uFF98\uFF92\uFF9B\uFF8C\uFF98\uFF92\uFFA6\uFF4D\uFF76\uFF7B\uFF81\uFF72\uFF74\uFF72\uFF7F\uFF59\uFF4D\uFFA1\uFF96\uFF9A\uFF92\uFFA0\uFFA1\uFF8E\uFF9A\uFF9D\uFF4D\uFF7B\uFF82\uFF7A\uFF72\uFF7F\uFF76\uFF70\uFF59\uFF4D\uFFA2\uFF9B\uFF9D\uFF9F\uFF92\uFF91\uFF96\uFF90\uFFA1\uFF8E\uFF8F\uFF99\uFF92\uFF8C\uFF9B\uFFA2\uFF9A\uFF8F\uFF92\uFF9F\uFF4D\uFF81\uFF72\uFF85\uFF81\uFF59\uFF4D\uFF8E\uFFA1\uFF90\uFF4D\uFF76\uFF7B\uFF81\uFF72\uFF74\uFF72\uFF7F\uFF59\uFF4D\uFFA1\uFF9F\uFF8E\uFF9B\uFFA0\uFF8E\uFF90\uFFA1\uFF96\uFF9C\uFF9B\uFF8C\uFFA1\uFFA6\uFF9D\uFF92\uFF4D\uFF81\uFF72\uFF85\uFF81\uFF59\uFF4D\uFF8E\uFF9D\uFF96\uFF4D\uFF81\uFF72\uFF85\uFF81\uFF59\uFF4D\uFF90\uFF9F\uFFA6\uFF9D\uFFA1\uFF9C\uFF94\uFF9F\uFF8E\uFF9A\uFF4D\uFF81\uFF72\uFF85\uFF81\uFF59\uFF4D\uFF73\uFF7C\uFF7F\uFF72\uFF76\uFF74\uFF7B\uFF4D\uFF78\uFF72\uFF86\uFF55\uFFA1\uFF9C\uFF98\uFF92\uFF9B\uFF8C\uFF98\uFF92\uFFA6\uFF56\uFF4D\uFF7F\uFF72\uFF73\uFF72\uFF7F\uFF72\uFF7B\uFF70\uFF72\uFF80\uFF4D\uFFA1\uFF8F\uFF99\uFF8C\uFFA1\uFF9C\uFF98\uFF92\uFF9B\uFF8C\uFF96\uFF9B\uFF93\uFF9C\uFF4D\uFF55\uFF8C\uFF96\uFF91\uFF56\uFF4D\uFF7C\uFF7B\uFF4D\uFF71\uFF72\uFF79\uFF72\uFF81\uFF72\uFF4D\uFF70\uFF6E\uFF80\uFF70\uFF6E\uFF71\uFF72\uFF4D\uFF56\uFF68", '\220', 'C', '\0');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\232\207\232\234\254\256\263", '\377', '\002'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            s
        });
        sqlitedatabase = b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;
        s = grrrrr.b044C044C044C044C044C044C("\205\224\207\203\226\207b\226\224\213\211\211\207\224b\267\262\246\243\266\247\241\265\247\256\247\245\266\247\246\241\245\243\264\246\241\261\260\241\246\247\256\247\266\247b\204\207\210\221\224\207b\206\207\216\207\226\207b\221\220b\266\244\256\241\266\261\255\247\260\241\253\260\250\261b\204\207\211\213\220b\227\222\206\203\226\207b\266\244\256\241\265\247\266\266\253\260\251\265b\225\207\226b\265\247\256\247\245\266\241\245\243\264\246\177osb\231\212\207\224\207b\265\247\256\247\245\266\241\245\243\264\246b\177b\261\256\246p\241\253\246}b\207\220\206}", 'B', '\005');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\233\256\233\231\211\207\202", '6', '\005'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            s
        });
        rrrrrr/llpppp;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        rrrrrr/llpppp;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
    }

    public Cursor b0415041504150415041504150415(String s, String as[], String s1, String as1[], String s2)
    {
        rrrrrr/llpppp;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;
        Method method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE5\uFFE9\uFFD9\uFFE6\uFFED", '\332', 'N', '\001'), new Class[] {
            java/lang/String, [Ljava/lang/String;, java/lang/String, [Ljava/lang/String;, java/lang/String, java/lang/String, java/lang/String
        });
        s = ((String) (method.invoke(sqlitedatabase, new Object[] {
            s, as, s1, as1, null, null, s2
        })));
        s = (Cursor)s;
        rrrrrr/llpppp;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s.getCause();
        s;
        rrrrrr/llpppp;
        JVM INSTR monitorexit ;
        throw s;
    }

    public long b0415041504150415041504150415(String s, ContentValues contentvalues)
    {
        rrrrrr/llpppp;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        Method method;
        sqlitedatabase = b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\u01D3\u01D8\u01DD\u01CF\u01DC\u01DE\u01B9\u01DC\u01BE\u01D2\u01DC\u01D9\u01E1", '\376', 'l', '\003'), new Class[] {
            java/lang/String, java/lang/String, android/content/ContentValues
        });
        s = ((String) (method.invoke(sqlitedatabase, new Object[] {
            s, null, contentvalues
        })));
        long l = ((Long)s).longValue();
        rrrrrr/llpppp;
        JVM INSTR monitorexit ;
        return l;
        s;
        throw s.getCause();
        s;
        rrrrrr/llpppp;
        JVM INSTR monitorexit ;
        throw s;
    }

    public int b0415041504150415041504150415(String s, ContentValues contentvalues, String s1, String as[])
    {
        rrrrrr/llpppp;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;
        Method method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\uFF37\uFF32\uFF26\uFF23\uFF36\uFF27", 'F', '\370', '\0'), new Class[] {
            java/lang/String, android/content/ContentValues, java/lang/String, [Ljava/lang/String;
        });
        s = ((String) (method.invoke(sqlitedatabase, new Object[] {
            s, contentvalues, s1, as
        })));
        int i = ((Integer)s).intValue();
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 112
    //                   0 139
    //                   1 89;
           goto _L1 _L2 _L3
_L1:
        1;
        JVM INSTR tableswitch 0 1: default 136
    //                   0 89
    //                   1 139;
           goto _L1 _L3 _L2
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 164
    //                   0 89
    //                   1 191;
           goto _L4 _L3 _L5
_L4:
        0;
        JVM INSTR tableswitch 0 1: default 188
    //                   0 191
    //                   1 89;
           goto _L4 _L5 _L3
_L5:
        rrrrrr/llpppp;
        JVM INSTR monitorexit ;
        return i;
        s;
        throw s.getCause();
        s;
        rrrrrr/llpppp;
        JVM INSTR monitorexit ;
        throw s;
    }

    public int b0415041504150415041504150415(String s, String s1, String as[])
    {
        rrrrrr/llpppp;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b041304130413041304130413_android_database_sqlite_SQLiteDatabase_fld;
_L8:
        0;
        JVM INSTR tableswitch 0 1: default 32
    //                   0 59
    //                   1 9;
           goto _L1 _L2 _L3
_L3:
        continue; /* Loop/switch isn't completed */
_L1:
label0:
        while (true) 
        {
            switch (0)
            {
            default:
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
        }
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 84
    //                   0 9
    //                   1 111;
           goto _L4 _L5 _L6
_L5:
        continue; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        while (true) 
        {
            switch (1)
            {
            default:
                break;

            case 0: // '\0'
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                break; /* Loop/switch isn't completed */
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
        Method method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6F\uFF70\uFF77\uFF70\uFF7F\uFF70", '\365', '\0'), new Class[] {
            java/lang/String, java/lang/String, [Ljava/lang/String;
        });
        s = ((String) (method.invoke(sqlitedatabase, new Object[] {
            s, s1, as
        })));
        int i = ((Integer)s).intValue();
        rrrrrr/llpppp;
        JVM INSTR monitorexit ;
        return i;
        s;
        rrrrrr/llpppp;
        JVM INSTR monitorexit ;
        throw s;
        s;
        throw s.getCause();
    }

    static 
    {
        Object obj;
        int i;
        try
        {
            b041304130413041304130413_java_lang_String_static_fld = grrrrr.b044C044C044C044C044C044C(b041304130413041304130413_java_lang_String_static_fld, '\004', '\357', '\001');
            obj = grrrrr.b044C044C044C044C044C044C(b041304130413041304130413_java_lang_String_static_fld, ')', '\001');
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        i = b041304130413041304130413_int_static_fld;
        switch ((i * (b041304130413041304130413_int_static_fld + i)) % b041304130413041304130413_int_static_fld)
        {
        default:
            Object obj2 = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("H\u03FB\026\032\027\033\u03FB\026\032\027\033\u03FB\026\032\027\033\026\032\027\033", '\r', '\003'), new Class[0]);
            Object obj1;
            int j;
            int k;
            int l;
            int i1;
            int j1;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041304130413041304130413_int_static_fld = ((Integer)obj2).intValue();
            b041304130413041304130413_int_static_fld = 26;
            // fall through

        case 0: // '\0'
            obj2 = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("r\u0425@DAE\u0425@DAE\u0425@DAE@DAE", '\177', '\217', '\001'), new Class[0]);
            break;
        }
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        j = ((Integer)obj2).intValue();
        try
        {
            k = b041304130413041304130413_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        obj2 = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("\330\u048B\246\252\247\253\u048B\246\252\247\253\u048B\246\252\247\253\246\252\247\253", '\203', '\r', '\002'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        l = ((Integer)obj2).intValue();
        i1 = b041304130413041304130413_int_static_fld;
        j1 = b041304130413041304130413_int_static_fld;
        if ((l * (k + j)) % i1 == j1)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        obj2 = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("\u015E\u0511\u012C\u0130\u012D\u0131\u0511\u012C\u0130\u012D\u0131\u0511\u012C\u0130\u012D\u0131\u012C\u0130\u012D\u0131", '~', '\001'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        j = ((Integer)obj2).intValue();
        b041304130413041304130413_int_static_fld = j;
        b041304130413041304130413_int_static_fld = 64;
        b041304130413041304130413_java_lang_String_static_fld = ((String) (obj));
        b041304130413041304130413_java_lang_String_static_fld = grrrrr.b044C044C044C044C044C044C(b041304130413041304130413_java_lang_String_static_fld, '\272', '\003');
        obj = grrrrr.b044C044C044C044C044C044C(b041304130413041304130413_java_lang_String_static_fld, '\305', '5', '\002');
        b041304130413041304130413_java_lang_String_static_fld = ((String) (obj));
        b041304130413041304130413_java_lang_String_static_fld = grrrrr.b044C044C044C044C044C044C(b041304130413041304130413_java_lang_String_static_fld, '|', '\006');
        b041304130413041304130413_java_lang_String_static_fld = grrrrr.b044C044C044C044C044C044C(b041304130413041304130413_java_lang_String_static_fld, '\213', '\006');
        obj = b041304130413041304130413_java_lang_String_static_fld;
        b041304130413041304130413_java_lang_String_static_fld = grrrrr.b044C044C044C044C044C044C(((String) (obj)), '2', '\351', '\002');
        obj = java/lang/Class.getMethod(nuuuuu.b0417041704170417041704170417(";9H'=AD@9\"5A9", '\004', '(', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(rrrrrr/llpppp, new Object[0]);
        obj = (String)obj;
        b041304130413041304130413_java_lang_String_static_fld = ((String) (obj));
        return;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }
}
