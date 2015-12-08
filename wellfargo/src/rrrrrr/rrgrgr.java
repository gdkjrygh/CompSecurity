// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            grrrrr, llpppp, ppplpp

public class rrgrgr extends SQLiteOpenHelper
{

    public static int b041A041A041A041A041A041A_int_static_fld = 2;
    private static rrgrgr b041A041A041A041A041A041A_rrrrrr_rrgrgr_static_fld;
    public static int b041A041A041A041A041A041A_int_static_fld = 40;
    public static int b041A041A041A041A041A041A_int_static_fld = 1;
    private static SQLiteDatabase b041A041A041A041A041A041A_android_database_sqlite_SQLiteDatabase_static_fld;
    public static int b041A041A041A041A041A041A_int_static_fld;

    private rrgrgr(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory, int i)
    {
        int j = b041A041A041A041A041A041A_int_static_fld;
        int k = b041A041A041A041A041A041A_int_static_fld;
        int l = b041A041A041A041A041A041A_int_static_fld;
        Object obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\036\u03E7\uFFEC\uFFF0\uFFEE\uFFFE\u03E7\uFFEC\uFFF0\uFFEE\uFFFE\uFFEC\uFFF0\uFFEE\uFFFE\u03E7", '#', 'g', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context.getCause();
        }
        if ((l * (j + k)) % ((Integer)obj).intValue() != b041A041A041A041A041A041A_int_static_fld)
        {
            b041A041A041A041A041A041A_int_static_fld = 60;
            b041A041A041A041A041A041A_int_static_fld = 93;
        }
        try
        {
            j = b041A041A041A041A041A041A_int_static_fld;
            k = b041A041A041A041A041A041A_int_static_fld;
            l = b041A041A041A041A041A041A_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        (j * (k + j)) % l;
        JVM INSTR tableswitch 0 0: default 124
    //                   0 221;
           goto _L1 _L2
_L1:
        obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("wEIGW\u0440\u0440EIGWEIGW\u0440", '\256', '\231', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        try
        {
            b041A041A041A041A041A041A_int_static_fld = j;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u019E\u016C\u0170\u016E\u017E\u0567\u0567\u016C\u0170\u016E\u017E\u016C\u0170\u016E\u017E\u0567", '\236', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        b041A041A041A041A041A041A_int_static_fld = j;
_L2:
        try
        {
            super(context, s, cursorfactory, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
        context;
        throw context.getCause();
        context;
        throw context.getCause();
    }

    public static rrgrgr b042B042B042B042B042B042B(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory, int i)
    {
        if (b041A041A041A041A041A041A_rrrrrr_rrgrgr_static_fld != null) goto _L2; else goto _L1
_L1:
        rrrrrr/rrgrgr;
        JVM INSTR monitorenter ;
        if (b041A041A041A041A041A041A_rrrrrr_rrgrgr_static_fld != null) goto _L4; else goto _L3
_L6:
        b041A041A041A041A041A041A_rrrrrr_rrgrgr_static_fld = new rrgrgr(context, s, cursorfactory, i);
_L4:
        rrrrrr/rrgrgr;
        JVM INSTR monitorexit ;
_L2:
        return b041A041A041A041A041A041A_rrrrrr_rrgrgr_static_fld;
        context;
        rrrrrr/rrgrgr;
        JVM INSTR monitorexit ;
        throw context;
_L3:
        1;
        JVM INSTR tableswitch 0 1: default 68
    //                   0 45
    //                   1 18;
           goto _L5 _L3 _L6
_L5:
        0;
        JVM INSTR tableswitch 0 1: default 92
    //                   0 18
    //                   1 45;
           goto _L5 _L6 _L3
    }

    public static int b042B042B042B042B042B042B()
    {
        return 19;
    }

    public static int b042B042B042B042B042B042B()
    {
        return 2;
    }

    public SQLiteDatabase getWritableDatabase()
    {
label0:
        {
            int i = b041A041A041A041A041A041A_int_static_fld;
            int k = b041A041A041A041A041A041A_int_static_fld;
            Object obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("@\u0409\022\026\020`\u0409\022\026\020`\022\026\020`\u0409", '"', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            switch (((k + i) * i) % ((Integer)obj).intValue())
            {
            default:
                Object obj1 = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\236lpn~\u0467\u0467lpn~lpn~\u0467", '\343', '\247', '\002'), new Class[0]);
                int j;
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b041A041A041A041A041A041A_int_static_fld = ((Integer)obj1).intValue();
                b041A041A041A041A041A041A_int_static_fld = 37;
                j = b041A041A041A041A041A041A_int_static_fld;
                switch ((j * (b041A041A041A041A041A041A_int_static_fld + j)) % b041A041A041A041A041A041A_int_static_fld)
                {
                default:
                    b041A041A041A041A041A041A_int_static_fld = 26;
                    Object obj2 = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u0137\u0105\u0109\u0107\u0117\u0500\u0500\u0105\u0109\u0107\u0117\u0105\u0109\u0107\u0117\u0500", '\325', '\005'), new Class[0]);
                    InvocationTargetException invocationtargetexception;
                    Method method;
                    try
                    {
                        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                    }
                    catch (InvocationTargetException invocationtargetexception3)
                    {
                        throw invocationtargetexception3.getCause();
                    }
                    b041A041A041A041A041A041A_int_static_fld = ((Integer)obj2).intValue();
                    break;

                case 0: // '\0'
                    break;
                }
                break;

            case 0: // '\0'
                break;
            }
            if (b041A041A041A041A041A041A_android_database_sqlite_SQLiteDatabase_static_fld != null)
            {
                obj2 = b041A041A041A041A041A041A_android_database_sqlite_SQLiteDatabase_static_fld;
                method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\327\341\275\336\323\334", '\257', 'A', '\002'), new Class[0]);
                try
                {
                    obj2 = method.invoke(obj2, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (InvocationTargetException invocationtargetexception)
                {
                    throw invocationtargetexception.getCause();
                }
                if (((Boolean)obj2).booleanValue())
                {
                    break label0;
                }
            }
            obj2 = super.getWritableDatabase();
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
            b041A041A041A041A041A041A_android_database_sqlite_SQLiteDatabase_static_fld = ((SQLiteDatabase) (obj2));
        }
        return b041A041A041A041A041A041A_android_database_sqlite_SQLiteDatabase_static_fld;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        int i = b041A041A041A041A041A041A_int_static_fld;
        switch ((i * (b041A041A041A041A041A041A_int_static_fld + i)) % b041A041A041A041A041A041A_int_static_fld)
        {
        default:
            b041A041A041A041A041A041A_int_static_fld = 22;
            Object obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\006\uFFD4\uFFD8\uFFD6\uFFE6\u03CF\u03CF\uFFD4\uFFD8\uFFD6\uFFE6\uFFD4\uFFD8\uFFD6\uFFE6\u03CF", '\t', 'e', '\002'), new Class[0]);
            Method method;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                throw sqlitedatabase.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            obj = grrrrr.b044C044C044C044C044C044C("\200\221\206\202\227\206\343\227\202\201\217\206\343\267\241\257\234\267\254\250\246\255\234\252\255\245\254\343\353\234\252\247\343\212\215\227\206\204\206\221\343\223\221\212\216\202\221\232\343\210\206\232\343\202\226\227\214\212\215\200\221\206\216\206\215\227\357\343\263\242\255\234\261\246\245\246\261\246\255\240\246\234\252\247\343\227\206\233\227\357\343\267\254\250\246\255\234\261\246\262\266\246\260\267\246\261\234\252\247\343\227\206\233\227\357\343\267\254\250\246\255\234\261\246\245\246\261\246\255\240\246\234\252\247\343\227\206\233\227\357\343\263\261\246\260\246\255\267\242\267\252\254\255\234\267\272\263\246\343\227\206\233\227\357\343\260\267\254\261\242\244\246\234\267\272\263\246\343\227\206\233\227\357\343\242\263\263\234\263\261\244\261\256\234\252\247\343\227\206\233\227\357\343\257\242\255\244\343\227\206\233\227\357\343\246\273\263\252\261\242\267\252\254\255\234\256\254\255\267\253\343\227\206\233\227\357\343\246\273\263\252\261\242\267\252\254\255\234\272\246\242\261\343\227\206\233\227\357\343\260\267\242\267\252\240\234\263\242\261\242\256\260\343\227\206\233\227\357\343\247\272\255\242\256\252\240\234\250\246\272\343\201\217\214\201\357\343\256\242\240\234\257\246\245\267\234\250\246\272\343\201\217\214\201\357\343\256\242\240\234\261\252\244\253\267\234\250\246\272\343\201\217\214\201\357\343\247\272\255\242\256\252\240\234\247\250\252\343\227\206\233\227\357\343\247\272\255\242\256\252\240\234\260\267\242\267\266\260\234\260\267\242\267\266\260\343\227\206\233\227\357\343\247\272\255\242\256\252\240\234\260\267\242\267\266\260\234\261\246\242\260\254\255\234\240\254\247\246\343\227\206\233\227\357\343\247\272\255\242\256\252\240\234\260\267\242\267\266\260\234\261\246\242\260\254\255\234\260\267\242\267\266\260\343\227\206\233\227\357\343\267\254\250\246\255\234\260\267\242\267\266\260\234\260\267\242\267\266\260\343\227\206\233\227\357\343\267\254\250\246\255\234\260\267\242\267\266\260\234\261\246\242\260\254\255\234\240\254\247\246\343\227\206\233\227\357\343\267\254\250\246\255\234\260\267\242\267\266\260\234\261\246\242\260\254\255\234\260\267\242\267\266\260\343\227\206\233\227\357\343\257\242\260\267\234\245\254\266\261\343\227\206\233\227\357\343\240\242\261\247\234\242\261\267\234\266\261\252\343\227\206\233\227\357\343\240\242\261\247\234\261\246\245\234\252\247\343\227\206\233\227\357\343\255\252\240\343\212\215\227\206\204\206\221\357\343\257\254\240\242\267\246\234\260\242\247\234\254\245\245\260\246\267\343\212\215\227\206\204\206\221\357\343\260\247\242\247\234\260\245\252\343\212\215\227\206\204\206\221\357\343\260\247\242\247\234\261\246\240\343\212\215\227\206\204\206\221\357\343\260\247\242\247\234\254\245\245\260\246\267\343\212\215\227\206\204\206\221\357\343\260\247\242\247\234\257\246\255\244\267\253\343\212\215\227\206\204\206\221\357\343\240\242\261\234\247\242\267\242\234\254\245\245\260\246\267\343\212\215\227\206\204\206\221\357\343\247\246\240\252\256\242\257\252\271\246\247\234\240\261\272\263\267\254\234\247\242\267\242\343\201\217\214\201\357\343\241\254\266\255\240\272\234\260\266\241\256\242\261\252\255\246\343\201\217\214\201\357\343\226\215\212\222\226\206\343\353\267\254\250\246\255\234\261\246\262\266\246\260\267\246\261\234\252\247\357\267\254\250\246\255\234\261\246\245\246\261\246\255\240\246\234\252\247\352\343\214\215\343\200\214\215\205\217\212\200\227\343\205\202\212\217\352\370", '\303', '\002');
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw sqlitedatabase;
        }
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\uFF47\uFF5A\uFF47\uFF45\uFF35\uFF33\uFF2E", '5', '\351', '\0'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            obj
        });
        obj = grrrrr.b044C044C044C044C044C044C("\uFDA0\uFDAF\uFDA2\uFD9E\uFDB1\uFDA2\uFD7D\uFDB1\uFD9E\uFD9F\uFDA9\uFDA2\uFD7D\uFDD1\uFDBF\uFDC9\uFDBC\uFDC1\uFDBE\uFDD1\uFDBE\uFDBC\uFDC4\uFDCF\uFDCC\uFDD2\uFDCD\uFD85\uFDBC\uFDC6\uFDC1\uFD7D\uFDA6\uFDAB\uFDB1\uFDA2\uFDA4\uFDA2\uFDAF\uFD7D\uFDAB\uFDAC\uFDB1\uFD7D\uFDAB\uFDB2\uFDA9\uFDA9\uFD7D\uFDAD\uFDAF\uFDA6\uFDAA\uFD9E\uFDAF\uFDB6\uFD7D\uFDA8\uFDA2\uFDB6\uFD7D\uFD9E\uFDB2\uFDB1\uFDAC\uFDA6\uFDAB\uFDA0\uFDAF\uFDA2\uFDAA\uFDA2\uFDAB\uFDB1\uFD89\uFD7D\uFDD1\uFDCC\uFDC8\uFDC2\uFDCB\uFDBC\uFDC8\uFDC2\uFDD6\uFD7D\uFDA6\uFDAB\uFDB1\uFDA2\uFDA4\uFDA2\uFDAF\uFD89\uFD7D\uFDC1\uFDC4\uFDC6\uFD7D\uFDB1\uFDA2\uFDB5\uFDB1\uFD7D\uFDAB\uFDAC\uFDB1\uFD7D\uFDAB\uFDB2\uFDA9\uFDA9\uFD89\uFD7D\uFDC1\uFDC4\uFDC6\uFDBC\uFDC1\uFDBE\uFDD1\uFDBE\uFD7D\uFD9F\uFDA9\uFDAC\uFD9F\uFD7D\uFDAB\uFDAC\uFDB1\uFD7D\uFDAB\uFDB2\uFDA9\uFDA9\uFD89\uFD7D\uFDA3\uFDAC\uFDAF\uFDA2\uFDA6\uFDA4\uFDAB\uFD7D\uFDA8\uFDA2\uFDB6\uFD85\uFDD1\uFDCC\uFDC8\uFDC2\uFDCB\uFDBC\uFDC8\uFDC2\uFDD6\uFD86\uFD7D\uFDAF\uFDA2\uFDA3\uFDA2\uFDAF\uFDA2\uFDAB\uFDA0\uFDA2\uFDB0\uFD7D\uFDD1\uFDBF\uFDC9\uFDBC\uFDD1\uFDCC\uFDC8\uFDC2\uFDCB\uFDBC\uFDC6\uFDCB\uFDC3\uFDCC\uFD7D\uFD85\uFDBC\uFDC6\uFDC1\uFD86\uFD7D\uFDAC\uFDAB\uFD7D\uFDA1\uFDA2\uFDA9\uFDA2\uFDB1\uFDA2\uFD7D\uFDA0\uFD9E\uFDB0\uFDA0\uFD9E\uFDA1\uFDA2\uFD89\uFD7D\uFDB2\uFDAB\uFDA6\uFDAE\uFDB2\uFDA2\uFD7D\uFD85\uFDD1\uFDCC\uFDC8\uFDC2\uFDCB\uFDBC\uFDC8\uFDC2\uFDD6\uFD89\uFDC1\uFDC4\uFDC6\uFD86\uFD7D\uFDAC\uFDAB\uFD7D\uFDA0\uFDAC\uFDAB\uFDA3\uFDA9\uFDA6\uFDA0\uFDB1\uFD7D\uFDAF\uFDA2\uFDAD\uFDA9\uFD9E\uFDA0\uFDA2\uFD86\uFD98", '\341', '\004');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\u017B\u018E\u017B\u0179\u0169\u0167\u0162", '\213', '\001'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            obj
        });
        obj = grrrrr.b044C044C044C044C044C044C("\uFFA2\uFFB1\uFFA4\uFFA0\uFFB3\uFFA4\uFF7F\uFFB3\uFFA0\uFFA1\uFFAB\uFFA4\uFF7F\uFFD3\uFFC1\uFFCB\uFFBE\uFFD2\uFFC4\uFFD3\uFFD3\uFFC8\uFFCD\uFFC6\uFFD2\uFF7F\uFF87\uFFBE\uFFC8\uFFC3\uFF7F\uFFA8\uFFAD\uFFB3\uFFA4\uFFA6\uFFA4\uFFB1\uFF7F\uFFAF\uFFB1\uFFA8\uFFAC\uFFA0\uFFB1\uFFB8\uFF7F\uFFAA\uFFA4\uFFB8\uFF8B\uFF7F\uFFC0\uFFC2\uFFC2\uFFC4\uFFD2\uFFD2\uFFBE\uFFD3\uFFCE\uFFCA\uFFC4\uFFCD\uFFBE\uFFC0\uFFC3\uFFD5\uFFBE\uFFD6\uFFC0\uFFD1\uFFCD\uFFC8\uFFCD\uFFC6\uFFBE\uFFCF\uFFC4\uFFD1\uFFC2\uFFC4\uFFCD\uFFD3\uFF7F\uFFA8\uFFAD\uFFB3\uFFA4\uFFA6\uFFA4\uFFB1\uFF8B\uFF7F\uFFC0\uFFC2\uFFC2\uFFC4\uFFD2\uFFD2\uFFBE\uFFD3\uFFCE\uFFCA\uFFC4\uFFCD\uFFBE\uFFC0\uFFC3\uFFD5\uFFBE\uFFD6\uFFC0\uFFD1\uFFCD\uFFC8\uFFCD\uFFC6\uFFBE\uFFD3\uFFC8\uFFCC\uFFC4\uFF7F\uFFA8\uFFAD\uFFB3\uFFA4\uFFA6\uFFA4\uFFB1\uFF8B\uFF7F\uFFC2\uFFC7\uFFC4\uFFC2\uFFCA\uFFBE\uFFD2\uFFD3\uFFC0\uFFD3\uFFD4\uFFD2\uFFBE\uFFCF\uFFC4\uFFD1\uFFC8\uFFCE\uFFC3\uFF7F\uFFA8\uFFAD\uFFB3\uFFA4\uFFA6\uFFA4\uFFB1\uFF8B\uFF7F\uFFD2\uFFC4\uFFCB\uFFC4\uFFC2\uFFD3\uFFBE\uFFC2\uFFC0\uFFD1\uFFC3\uFF7F\uFFA8\uFFAD\uFFB3\uFFA4\uFFA6\uFFA4\uFFB1\uFF8B\uFF7F\uFFC2\uFFD5\uFFCC\uFFBE\uFFC4\uFFCD\uFFD3\uFFC8\uFFD3\uFFD8\uFF7F\uFFB3\uFFA4\uFFB7\uFFB3\uFF8B\uFF7F\uFFC2\uFFD5\uFFCC\uFFBE\uFFD3\uFFD8\uFFCF\uFFC4\uFF7F\uFFB3\uFFA4\uFFB7\uFFB3\uFF8B\uFF7F\uFFC2\uFFD5\uFFCC\uFFBE\uFFD5\uFFC4\uFFD1\uFFC8\uFFC5\uFFC8\uFFC4\uFFC3\uFF7F\uFFA8\uFFAD\uFFB3\uFFA4\uFFA6\uFFA4\uFFB1\uFF8B\uFF7F\uFFC4\uFFCD\uFFC3\uFFBE\uFFCF\uFFCE\uFFC8\uFFCD\uFFD3\uFF7F\uFFB3\uFFA4\uFFB7\uFFB3\uFF8B\uFF7F\uFFC4\uFFCD\uFFD5\uFFC8\uFFD1\uFFCE\uFFCD\uFFCC\uFFC4\uFFCD\uFFD3\uFF7F\uFFB3\uFFA4\uFFB7\uFFB3\uFF8B\uFF7F\uFFD3\uFFC7\uFFCC\uFFBE\uFFC4\uFFCD\uFFC0\uFFC1\uFFCB\uFFC4\uFFC3\uFF7F\uFFA8\uFFAD\uFFB3\uFFA4\uFFA6\uFFA4\uFFB1\uFF8B\uFF7F\uFFC1\uFFCE\uFFD4\uFFCD\uFFC2\uFFD8\uFFBE\uFFC0\uFFC8\uFFD1\uFFCF\uFFCB\uFFC0\uFFCD\uFFC4\uFF7F\uFFA1\uFFAB\uFFAE\uFFA1\uFF8B\uFF7F\uFFCC\uFFC0\uFFD7\uFFBE\uFFD3\uFFD5\uFFCB\uFF7F\uFFA8\uFFAD\uFFB3\uFFA4\uFFA6\uFFA4\uFFB1\uFF7F\uFFA3\uFFA4\uFFA5\uFFA0\uFFB4\uFFAB\uFFB3\uFF7F\uFF94\uFF8F\uFF88\uFF9A", '\242', '\001', '\001');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\321\314\321\327\347\345\370", '\264', '\002'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            obj
        });
        obj = grrrrr.b044C044C044C044C044C044C("\uFFF5\004\uFFF7\uFFF3\006\uFFF7\uFFD2\006\uFFF3\uFFF4\uFFFE\uFFF7\uFFD2&\024\036\021&(\036\uFFD2\uFFDA\021\033\026\uFFD2\uFFFB\000\006\uFFF7\uFFF9\uFFF7\004\uFFD2\002\004\uFFFB\uFFFF\uFFF3\004\013\uFFD2\uFFFD\uFFF7\013\uFFD2\uFFF3\007\006\001\uFFFB\000\uFFF5\004\uFFF7\uFFFF\uFFF7\000\006\uFFDE\uFFD2&!\035\027 \021\035\027+\uFFD2\uFFFB\000\006\uFFF7\uFFF9\uFFF7\004\uFFDE\uFFD2&\033\037\027%&\023\037\"\uFFD2\000\007\uFFFF\uFFF7\004\uFFFB\uFFF5\uFFDE\uFFD2' \"$\027\026\033\025&\023\024\036\027\021 '\037\024\027$\uFFD2\006\uFFF7\n\006\uFFDE\uFFD2\023&\025\uFFD2\uFFFB\000\006\uFFF7\uFFF9\uFFF7\004\uFFDE\uFFD2&$\023 %\023\025&\033! \021&+\"\027\uFFD2\006\uFFF7\n\006\uFFDE\uFFD2\023\"\033\uFFD2\006\uFFF7\n\006\uFFDE\uFFD2\025$+\"&!\031$\023\037\uFFD2\006\uFFF7\n\006\uFFDE\uFFD2\uFFF8\001\004\uFFF7\uFFFB\uFFF9\000\uFFD2\uFFFD\uFFF7\013\uFFDA&!\035\027 \021\035\027+\uFFDB\uFFD2\004\uFFF7\uFFF8\uFFF7\004\uFFF7\000\uFFF5\uFFF7\005\uFFD2&\024\036\021&!\035\027 \021\033 \030!\uFFD2\uFFDA\021\033\026\uFFDB\uFFD2\001\000\uFFD2\uFFF6\uFFF7\uFFFE\uFFF7\006\uFFF7\uFFD2\uFFF5\uFFF3\005\uFFF5\uFFF3\uFFF6\uFFF7\uFFD2\uFFDB\uFFED", '\202', '\320', '\002');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD6\uFFE9\uFFD6\uFFD4\uFFC4\uFFC2\uFFBD", 'T', '\343', '\002'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            obj
        });
        obj = grrrrr.b044C044C044C044C044C044C("ixkgzkFzxommkxF\233\226\212\207\232\213\205\231\213\222\213\211\232\213\212\205\211\207\230\212\205\225\224\205\212\213\222\213\232\213FhkluxkFjkrkzkFutF\232\210\222\205\232\225\221\213\224\205\217\224\214\225FhkmotF{vjgzkF\232\210\222\205\231\213\232\232\217\224\215\231FykzF\231\213\222\213\211\232\205\211\207\230\212cSWF}nkxkF\231\213\222\213\211\232\205\211\207\230\212FcF\225\222\212T\205\217\212aFktja", '\230', '\276', '\001');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\uFF03\uFF16\uFF03\uFF01\uFEF1\uFEEF\uFEEA", 'v', '\004'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            obj
        });
        sqlitedatabase = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("\u034A\u06FD\u06FD\u06FD\u06FD\u0318\u031C\u0319\u031D\u0318\u031C\u0319\u031D\u0318\u031C\u0319\u031D", '\370', '\006'), new Class[0]);
        sqlitedatabase = ((SQLiteDatabase) (sqlitedatabase.invoke(null, new Object[0])));
        sqlitedatabase = (String)sqlitedatabase;
        obj = grrrrr.b044C044C044C044C044C044C("\u0115\u0112\u0125\u0112\u0113\u0112\u0124\u0116\361\u0114\u0123\u0116\u0112\u0125\u0116\u0115", 'i', 'h', '\003');
        method = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\u0165\u0518\u0518\u0133\u0137\u0134\u0138\u0133\u0137\u0134\u0138\u0133\u0137\u0134\u0138\u0518\u0133\u0137\u0134\u0138", 'o', '\224', '\003'), new Class[] {
            java/lang/String, java/lang/String
        });
        method.invoke(null, new Object[] {
            sqlitedatabase, obj
        });
        return;
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        Method method;
        int i;
        int j;
        boolean flag;
        try
        {
            super.onOpen(sqlitedatabase);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw sqlitedatabase;
        }
        obj = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\uFEBB\uFEC5\uFEA4\uFEB7\uFEB3\uFEB6\uFEA1\uFEC0\uFEBE\uFECB", '\277', '\357', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(sqlitedatabase, new Object[0]);
        flag = ((Boolean)obj).booleanValue();
        i = b041A041A041A041A041A041A_int_static_fld;
        j = b041A041A041A041A041A041A_int_static_fld;
        switch ((j * (b041A041A041A041A041A041A_int_static_fld + j)) % b041A041A041A041A041A041A_int_static_fld)
        {
        default:
            obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417(" \uFFEE\uFFF2\uFFF0\000\u03E9\u03E9\uFFEE\uFFF2\uFFF0\000\uFFEE\uFFF2\uFFF0\000\u03E9", '\026', '\004'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                throw sqlitedatabase.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF1E\uFEEC\uFEF0\uFEEE\uFEFE\u02E7\u02E7\uFEEC\uFEF0\uFEEE\uFEFE\uFEEC\uFEF0\uFEEE\uFEFE\u02E7", 'l', '\004'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                throw sqlitedatabase.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
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
        if (((b041A041A041A041A041A041A_int_static_fld + i) * b041A041A041A041A041A041A_int_static_fld) % b041A041A041A041A041A041A_int_static_fld != b041A041A041A041A041A041A_int_static_fld)
        {
            obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\304\222\226\224\244\u048D\u048D\222\226\224\244\222\226\224\244\u048D", '1', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                throw sqlitedatabase.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u02C0\u028E\u0292\u0290\u02A0\u0689\u0689\u028E\u0292\u0290\u02A0\u028E\u0292\u0290\u02A0\u0689", '\312', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                throw sqlitedatabase.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj).intValue();
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_366;
        }
        obj = grrrrr.b044C044C044C044C044C044C("\u0216\u0218\u0207\u020D\u0213\u0207\u01E6\u022C\u0235\u0238\u022B\u022F\u022D\u0234\u0225\u0231\u022B\u023F\u0239\u0203\u0215\u0214\u0201", '\343', '\001');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\uFDAA\uFDBD\uFDAA\uFDA8\uFD98\uFD96\uFD91", '\351', '\004'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            obj
        });
        sqlitedatabase = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("\u019E\u0551\u0551\u0551\u0551\u016C\u0170\u016D\u0171\u016C\u0170\u016D\u0171\u016C\u0170\u016D\u0171", 'h', '\324', '\003'), new Class[0]);
        sqlitedatabase = ((SQLiteDatabase) (sqlitedatabase.invoke(null, new Object[0])));
        sqlitedatabase = (String)sqlitedatabase;
        try
        {
            obj = grrrrr.b044C044C044C044C044C044C("\uFFE6\uFFE3\uFFF6\uFFE3\uFFE4\uFFE3\uFFF5\uFFE7\uFFC2\uFFF1\uFFF2\uFFE7\uFFF0\uFFE7\uFFE6", '/', '\003');
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw sqlitedatabase;
        }
        method = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC0\u0373\u0373\uFF8E\uFF92\uFF8F\uFF93\uFF8E\uFF92\uFF8F\uFF93\uFF8E\uFF92\uFF8F\uFF93\u0373\uFF8E\uFF92\uFF8F\uFF93", '6', '\004'), new Class[] {
            java/lang/String, java/lang/String
        });
        method.invoke(null, new Object[] {
            sqlitedatabase, obj
        });
        return;
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        String s = grrrrr.b044C044C044C044C044C044C("\uFFCC\uFFDA\uFFD7\uFFD8\uFFA8\uFFDC\uFFC9\uFFCA\uFFD4\uFFCD\uFFA8\uFFD1\uFFCE\uFFA8\uFFCD\uFFE0\uFFD1\uFFDB\uFFDC\uFFDB\uFFA8\uFFFC\uFFEA\uFFF4\uFFE7\uFFFC\uFFF7\uFFF3\uFFED\uFFF6\uFFE7\uFFF1\uFFF6\uFFEE\uFFF7", 'x', '\0');
        Method method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("dwdbRPK", ':', '9', '\001'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            s
        });
        s = grrrrr.b044C044C044C044C044C044C("\024\"\037 \uFFF0$\021\022\034\025\uFFF0\031\026\uFFF0\025(\031#$#\uFFF0D2</C5DD9>7C", '\030', '\003');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\u01EB\u01FE\u01EB\u01E9\u01D9\u01D7\u01D2", '\202', '\006'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            s
        });
        s = grrrrr.b044C044C044C044C044C044C("\uFFEF\uFFFD\uFFFA\uFFFB\uFFCB\uFFFF\uFFEC\uFFED\uFFF7\uFFF0\uFFCB\uFFF4\uFFF1\uFFCB\uFFF0\003\uFFF4\uFFFE\uFFFF\uFFFE\uFFCB\037\r\027\n\017\f\037\f\n\022\035\032 \033", '%', '0', '\0');
        method = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\u0167\u017A\u0167\u0165\u0155\u0153\u014E", '\235', 'e', '\003'), new Class[] {
            java/lang/String
        });
        method.invoke(sqlitedatabase, new Object[] {
            s
        });
        if (((b041A041A041A041A041A041A_int_static_fld + b041A041A041A041A041A041A_int_static_fld) * b041A041A041A041A041A041A_int_static_fld) % b041A041A041A041A041A041A_int_static_fld != b041A041A041A041A041A041A_int_static_fld)
        {
            Object obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\376\314\320\316\336\u04C7\u04C7\314\320\316\336\314\320\316\336\u04C7", '\023', '\211', '\003'), new Class[0]);
            Method method1;
            int k;
            int l;
            int i1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                throw sqlitedatabase.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF86\uFF54\uFF58\uFF56\uFF66\u034F\u034F\uFF54\uFF58\uFF56\uFF66\uFF54\uFF58\uFF56\uFF66\u034F", 'n', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                throw sqlitedatabase.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj).intValue();
        }
        obj = grrrrr.b044C044C044C044C044C044C("\363\u0101\376\377\317\u0103\360\361\373\364\317\370\365\317\364\u0107\370\u0102\u0103\u0102\317\u0123\u0111\u011B\u010E\u0123\u0125\u011B", 'K', 'd', '\003');
        method1 = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\247\272\247\245\225\223\216", 'B', '\005'), new Class[] {
            java/lang/String
        });
        method1.invoke(sqlitedatabase, new Object[] {
            obj
        });
        obj = grrrrr.b044C044C044C044C044C044C("\307\325\322\323\243\327\325\314\312\312\310\325\243\314\311\243\310\333\314\326\327\326\243\370\363\347\344\367\350\342\366\350\357\350\346\367\350\347\342\346\344\365\347\342\362\361\342\347\350\357\350\367\350", '\037', '\242', '\001');
        method1 = android/database/sqlite/SQLiteDatabase.getMethod(nuuuuu.b0417041704170417041704170417("\uFFAB\uFFBE\uFFAB\uFFA9\uFF99\uFF97\uFF92", '>', '\004'), new Class[] {
            java/lang/String
        });
        method1.invoke(sqlitedatabase, new Object[] {
            obj
        });
        obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\363\362\307\366\351\345\370\351", 'B', '\001'), new Class[] {
            android/database/sqlite/SQLiteDatabase
        });
        ((Method) (obj)).invoke(this, new Object[] {
            sqlitedatabase
        });
        sqlitedatabase = rrrrrr/llpppp.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8F\u0342\u0342\u0342\u0342\uFF5D\uFF61\uFF5E\uFF62\uFF5D\uFF61\uFF5E\uFF62\uFF5D\uFF61\uFF5E\uFF62", '\220', 'C', '\0'), new Class[0]);
        sqlitedatabase = ((SQLiteDatabase) (sqlitedatabase.invoke(null, new Object[0])));
        sqlitedatabase = (String)sqlitedatabase;
        obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD6\uFFA4\uFFA8\uFFA6\uFFB6\u039F\u039F\uFFA4\uFFA8\uFFA6\uFFB6\uFFA4\uFFA8\uFFA6\uFFB6\u039F", 'F', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            j = b041A041A041A041A041A041A_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw sqlitedatabase;
        }
        obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\324\242\246\244\264\u049D\u049D\242\246\244\264\242\246\244\264\u049D", 'V', '\310', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        k = ((Integer)obj).intValue();
        l = b041A041A041A041A041A041A_int_static_fld;
        i1 = b041A041A041A041A041A041A_int_static_fld;
        if ((k * (j + i)) % l == i1)
        {
            break MISSING_BLOCK_LABEL_610;
        }
        try
        {
            b041A041A041A041A041A041A_int_static_fld = 72;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw sqlitedatabase;
        }
        obj = rrrrrr/rrgrgr.getMethod(nuuuuu.b0417041704170417041704170417("zHLJZ\u0443\u0443HLJZHLJZ\u0443", '^', 'F', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041A041A041A041A041A041A_int_static_fld = i;
        obj = grrrrr.b044C044C044C044C044C044C("\372\367\u010A\367\370\367\u0109\373\326\u010B\u0106\375\u0108\367\372\373\372", '[', '\001');
        method1 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\u017C\u052F\u052F\u014A\u014E\u014B\u014F\u014A\u014E\u014B\u014F\u014A\u014E\u014B\u014F\u052F\u014A\u014E\u014B\u014F", '^', '\006'), new Class[] {
            java/lang/String, java/lang/String
        });
        method1.invoke(null, new Object[] {
            sqlitedatabase, obj
        });
        return;
        sqlitedatabase;
        try
        {
            throw sqlitedatabase.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase) { }
        throw sqlitedatabase;
        sqlitedatabase;
        try
        {
            throw sqlitedatabase.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase) { }
        throw sqlitedatabase;
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
        sqlitedatabase;
        throw sqlitedatabase.getCause();
    }
}
