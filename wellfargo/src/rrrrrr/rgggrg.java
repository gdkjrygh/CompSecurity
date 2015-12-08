// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.content.Context;
import android.nfc.NfcAdapter;
import com.visa.cbp.sdk.facade.error.ReasonCode;
import com.visa.cbp.sdk.facade.error.SDKErrorType;
import com.visa.cbp.sdk.facade.exception.VisaSDKPermissionException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            grgrgr, grrrrr

public class rgggrg
{

    public static int b041504150415041504150415 = 0;
    public static int b041504150415041504150415 = 1;
    public static int b041504150415041504150415 = 2;
    public static int b041504150415041504150415 = 49;

    public rgggrg()
    {
        int i = b041504150415041504150415;
        switch ((i * (b041504150415041504150415 + i)) % b041504150415041504150415)
        {
        default:
            Object obj = rrrrrr/rgggrg.getMethod(nuuuuu.b0417041704170417041704170417("\033\u03E0\u03E0\u03E0\u03E0\uFFE9\uFFED\uFFEB\uFFF0\uFFE9\uFFED\uFFEB\uFFF0", '\331', '\222', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041504150415041504150415 = ((Integer)obj).intValue();
            b041504150415041504150415 = 24;
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public static int b042704270427042704270427()
    {
        return 0;
    }

    public static ArrayList b042704270427042704270427(Map map)
    {
        Object obj = null;
        Object obj3 = java/util/Map.getMethod(nuuuuu.b0417041704170417041704170417("\uFF39\uFF42\uFF48\uFF46\uFF4D\uFF27\uFF39\uFF48", '\322', 'Z', '\0'), new Class[0]);
        try
        {
            map = ((Map) (((Method) (obj3)).invoke(map, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw map.getCause();
        }
        map = (Set)map;
        obj3 = java/util/Set.getMethod(nuuuuu.b0417041704170417041704170417("\uFFBA\uFFC5\uFFB6\uFFC3\uFFB2\uFFC5\uFFC0\uFFC3", '\300', '\021', '\001'), new Class[0]);
        try
        {
            map = ((Map) (((Method) (obj3)).invoke(map, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw map.getCause();
        }
        obj3 = (Iterator)map;
        map = obj;
        do
        {
            Object obj1 = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD9\uFFD2\uFFE4\uFFBF\uFFD6\uFFE9\uFFE5", '\217', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(obj3, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                throw map.getCause();
            }
            if (((Boolean)obj1).booleanValue())
            {
                Object obj2 = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\u032F\u0326\u0339\u0335", '\353', '\006'), new Class[0]);
                Object obj4;
                Object obj5;
                Method method1;
                try
                {
                    obj2 = ((Method) (obj2)).invoke(obj3, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    throw map.getCause();
                }
                obj2 = (java.util.Map.Entry)(Object)obj2;
                obj4 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF5D\uFF2B\uFF2F\uFF2D\uFF3D\u0326\u0326\u0326\u0326\uFF2B\uFF2F\uFF2D\uFF3D", '\203', '\202', '\0'), new Class[0]);
                try
                {
                    obj4 = ((Method) (obj4)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    throw map.getCause();
                }
                obj4 = (Context)obj4;
                obj5 = java/util/Map$Entry.getMethod(nuuuuu.b0417041704170417041704170417("1/> +6?/", 'S', '\211', '\002'), new Class[0]);
                try
                {
                    obj5 = ((Method) (obj5)).invoke(obj2, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    throw map.getCause();
                }
                obj5 = (String)(Object)obj5;
                method1 = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("RWTRZ2P[[X]V>aBT[U?Ta\\XbbX^]", '.', '\035', '\001'), new Class[] {
                    java/lang/String
                });
                try
                {
                    obj4 = method1.invoke(obj4, new Object[] {
                        obj5
                    });
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    throw map.getCause();
                }
                if (-1 == ((Integer)obj4).intValue())
                {
                    if (map == null)
                    {
                        map = new ArrayList();
                    }
                    Method method = java/util/Map$Entry.getMethod(nuuuuu.b0417041704170417041704170417("\037\035,\003\0351", 'R', '\232', '\002'), new Class[0]);
                    int i;
                    try
                    {
                        obj2 = method.invoke(obj2, new Object[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Map map)
                    {
                        throw map.getCause();
                    }
                    obj2 = (Object)obj2;
                    method = java/util/ArrayList.getMethod(nuuuuu.b0417041704170417041704170417("\uFFFB\uFFFE\uFFFE", '"', '\004'), new Class[] {
                        java/lang/Object
                    });
                    try
                    {
                        obj2 = method.invoke(map, new Object[] {
                            obj2
                        });
                    }
                    // Misplaced declaration of an exception variable
                    catch (Map map)
                    {
                        throw map.getCause();
                    }
                    ((Boolean)obj2).booleanValue();
                    i = b041504150415041504150415;
                    obj2 = map;
                    switch ((i * (b041504150415041504150415 + i)) % b041504150415041504150415)
                    {
                    default:
                        obj2 = rrrrrr/rgggrg.getMethod(nuuuuu.b0417041704170417041704170417("e\u042A\u042A\u042A\u042A375:375:", '/', '2', '\001'), new Class[0]);
                        try
                        {
                            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                        }
                        // Misplaced declaration of an exception variable
                        catch (Map map)
                        {
                            throw map.getCause();
                        }
                        b041504150415041504150415 = ((Integer)obj2).intValue();
                        b041504150415041504150415 = 4;
                        obj2 = map;
                        break;

                    case 0: // '\0'
                        break;
                    }
                } else
                {
                    obj2 = map;
                }
                map = ((Map) (obj2));
            } else
            {
                return map;
            }
        } while (true);
    }

    public static int b042704270427042704270427()
    {
        return 2;
    }

    public static void b042704270427042704270427()
    {
        Object obj = new HashMap();
        Object obj1 = SDKErrorType.RECEIVE_BOOT_COMPLETED;
        Object obj2 = rrrrrr/rgggrg.getMethod(nuuuuu.b0417041704170417041704170417("\034\u0459\u0459\u0459\u0459NJLINJLI", '~', '\002'), new Class[0]);
        int i;
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj2).intValue();
        switch ((i * (b041504150415041504150415 + i)) % b041504150415041504150415)
        {
        default:
            Object obj3 = rrrrrr/rgggrg.getMethod(nuuuuu.b0417041704170417041704170417("\231\u04DC\u04DC\u04DC\u04DC\313\317\311\314\313\317\311\314", '\373', '\002'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            Method method;
            int j;
            int k;
            int l;
            int i1;
            try
            {
                obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b041504150415041504150415 = ((Integer)obj3).intValue();
            b041504150415041504150415 = 94;
            // fall through

        case 0: // '\0'
            obj3 = grrrrr.b044C044C044C044C044C044C("\003\020\006\024\021\013\006\uFFD0\022\007\024\017\013\025\025\013\021\020\uFFD0\uFFF4\uFFE7\uFFE3\uFFE6\001\uFFF2\uFFEA\uFFF1\uFFF0\uFFE7\001\uFFF5\uFFF6\uFFE3\uFFF6\uFFE7", '^', '\0');
            method = java/util/Map.getMethod(nuuuuu.b0417041704170417041704170417("\323\326\327", '\243', '\002'), new Class[] {
                java/lang/Object, java/lang/Object
            });
            break;
        }
        try
        {
            obj1 = method.invoke(obj, new Object[] {
                obj1, obj3
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        obj1 = (Object)obj1;
        obj1 = SDKErrorType.INTERNET_PERMISSION;
        obj3 = grrrrr.b044C044C044C044C044C044C("\237\254\242\260\255\247\242l\256\243\260\253\247\261\261\247\255\254l\207\214\222\203\220\214\203\222", '\037', ']', '\001');
        method = java/util/Map.getMethod(nuuuuu.b0417041704170417041704170417("\uFF20\uFF25\uFF24", 'p', '\004'), new Class[] {
            java/lang/Object, java/lang/Object
        });
        try
        {
            obj1 = method.invoke(obj, new Object[] {
                obj1, obj3
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        obj1 = (Object)obj1;
        obj1 = SDKErrorType.RECEIVE_BOOT_COMPLETED;
        obj3 = grrrrr.b044C044C044C044C044C044C("\347\364\352\370\365\357\352\264\366\353\370\363\357\371\371\357\365\364\264\330\313\311\313\317\334\313\345\310\325\325\332\345\311\325\323\326\322\313\332\313\312", '\206', '\005');
        method = java/util/Map.getMethod(nuuuuu.b0417041704170417041704170417("\u011C\u0121\u0120", 'V', '\001'), new Class[] {
            java/lang/Object, java/lang/Object
        });
        try
        {
            obj1 = method.invoke(obj, new Object[] {
                obj1, obj3
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        obj1 = (Object)obj1;
        obj1 = rrrrrr/rgggrg.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("X\u041D\u041D&*(-\u041D&*(-&*(-", '\005', '\003'), new Class[] {
            java/util/Map
        });
        try
        {
            obj = ((Method) (obj1)).invoke(null, new Object[] {
                obj
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        obj = (SDKErrorType)obj;
        if (obj != null)
        {
            obj1 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\244\246\267\216\246\260\260\242\244\246", '\303', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(obj, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            obj1 = (String)obj1;
            obj3 = ReasonCode.PERMISSION_ERROR;
            method = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\uFF68\uFF66\uFF75\uFF44\uFF70\uFF65\uFF66", '\377', '\0'), new Class[0]);
            try
            {
                obj = method.invoke(obj, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            throw new VisaSDKPermissionException(((String) (obj1)), ((ReasonCode) (obj3)), ((Integer)obj).intValue());
        }
        invocationtargetexception = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u014A\u0118\u011C\u011A\u012A\u0513\u0513\u0513\u0513\u0118\u011C\u011A\u012A", '\350', '\005'), new Class[0]);
        try
        {
            invocationtargetexception = ((InvocationTargetException) (invocationtargetexception.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        invocationtargetexception = (Context)invocationtargetexception;
        j = b041504150415041504150415;
        k = b041504150415041504150415;
        l = b041504150415041504150415;
        i1 = b041504150415041504150415;
        obj1 = rrrrrr/rgggrg.getMethod(nuuuuu.b0417041704170417041704170417("\036\uFFEC\uFFF0\uFFEE\uFFF3\uFFEC\uFFF0\uFFEE\uFFF3\u03E3\u03E3\uFFEC\uFFF0\uFFEE\uFFF3\uFFEC\uFFF0\uFFEE\uFFF3", '"', '\003'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if (((j + k) * l) % i1 != ((Integer)obj1).intValue())
        {
            b041504150415041504150415 = 42;
            obj1 = rrrrrr/rgggrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0136\u04FB\u04FB\u04FB\u04FB\u0104\u0108\u0106\u010B\u0104\u0108\u0106\u010B", '\235', '7', '\003'), new Class[0]);
            InvocationTargetException invocationtargetexception3;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception4)
            {
                throw invocationtargetexception4.getCause();
            }
            b041504150415041504150415 = ((Integer)obj1).intValue();
        }
        obj1 = android/nfc/NfcAdapter.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB7\uFFB5\uFFC4\uFF94\uFFB5\uFFB6\uFFB1\uFFC5\uFFBC\uFFC4\uFF91\uFFB4\uFFB1\uFFC0\uFFC4\uFFB5\uFFC2", 'X', '\003'), new Class[] {
            android/content/Context
        });
        try
        {
            invocationtargetexception = ((InvocationTargetException) (((Method) (obj1)).invoke(null, new Object[] {
                invocationtargetexception
            })));
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception3)
        {
            throw invocationtargetexception3.getCause();
        }
        if ((NfcAdapter)invocationtargetexception == null)
        {
            invocationtargetexception = SDKErrorType.NFC_NOT_SUPPORTED;
            obj1 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\371\367\u0106\337\367\u0105\u0105\363\371\367", 'I', '\001'), new Class[0]);
            try
            {
                invocationtargetexception = ((InvocationTargetException) (((Method) (obj1)).invoke(invocationtargetexception, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            invocationtargetexception = (String)invocationtargetexception;
            obj1 = ReasonCode.PERMISSION_ERROR;
            obj3 = SDKErrorType.NFC_NOT_SUPPORTED;
            method = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\024\022!\uFFF0\034\021\022", '\'', 'z', '\002'), new Class[0]);
            try
            {
                obj3 = method.invoke(obj3, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            throw new VisaSDKPermissionException(invocationtargetexception, ((ReasonCode) (obj1)), ((Integer)obj3).intValue());
        } else
        {
            return;
        }
    }

    private static SDKErrorType b042704270427042704270427(Map map)
    {
        Method method = java/util/Map.getMethod(nuuuuu.b0417041704170417041704170417("\345\356\364\362\371\323\345\364", '\375', '}', '\002'), new Class[0]);
        try
        {
            map = ((Map) (method.invoke(map, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw map.getCause();
        }
        map = (Set)map;
        method = java/util/Set.getMethod(nuuuuu.b0417041704170417041704170417("\267\302\263\300\257\302\275\300", '\032', '\006'), new Class[0]);
        try
        {
            map = ((Map) (method.invoke(map, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw map.getCause();
        }
        map = (Iterator)map;
        do
        {
            Object obj = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("}v\210cz\215\211", '\262', '\235', '\002'), new Class[0]);
            Object obj1;
            Object obj2;
            int i;
            try
            {
                obj = ((Method) (obj)).invoke(map, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                throw map.getCause();
            }
            if (!((Boolean)obj).booleanValue())
            {
                break;
            }
            obj = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\\Sfb", '%', '7', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(map, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                throw map.getCause();
            }
            obj = (java.util.Map.Entry)(Object)obj;
            obj1 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF92\uFF60\uFF64\uFF62\uFF72\u035B\u035B\u035B\u035B\uFF60\uFF64\uFF62\uFF72", '\320', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                throw map.getCause();
            }
            obj1 = (Context)obj1;
            obj2 = java/util/Map$Entry.getMethod(nuuuuu.b0417041704170417041704170417("\u02FB\u02F9\u0308\u02EA\u02F5\u0300\u0309\u02F9", '\334', '\006'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(obj, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                throw map.getCause();
            }
            obj2 = (String)(Object)obj2;
            i = b041504150415041504150415;
            switch ((i * (b041504150415041504150415 + i)) % b041504150415041504150415)
            {
            default:
                b041504150415041504150415 = 66;
                Object obj3 = rrrrrr/rgggrg.getMethod(nuuuuu.b0417041704170417041704170417(")\u046C\u046C\u046C\u046C{\177y|{\177y|", 'K', '\002'), new Class[0]);
                int j;
                try
                {
                    obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    throw map.getCause();
                }
                b041504150415041504150415 = ((Integer)obj3).intValue();
                // fall through

            case 0: // '\0'
                obj3 = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\221\226\223\221\231q\217\232\232\227\234\225}\240\201\223\232\224~\223\240\233\227\241\241\227\235\234", '2', '`', '\001'), new Class[] {
                    java/lang/String
                });
                break;
            }
            try
            {
                obj1 = ((Method) (obj3)).invoke(obj1, new Object[] {
                    obj2
                });
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                throw map.getCause();
            }
            if (-1 == ((Integer)obj1).intValue())
            {
                map = java/util/Map$Entry.getMethod(nuuuuu.b0417041704170417041704170417("\uFE93\uFE91\uFEA0\uFE77\uFE91\uFEA5", '\234', '\004'), new Class[0]);
                try
                {
                    map = ((Map) (map.invoke(obj, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    throw map.getCause();
                }
                return (SDKErrorType)(Object)map;
            }
            j = b041504150415041504150415;
            switch ((j * (b041504150415041504150415 + j)) % b041504150415041504150415)
            {
            default:
                obj = rrrrrr/rgggrg.getMethod(nuuuuu.b0417041704170417041704170417("\310\u048D\u048D\u048D\u048D\226\232\230\235\226\232\230\235", '\245', '?', '\002'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    throw map.getCause();
                }
                b041504150415041504150415 = ((Integer)obj).intValue();
                b041504150415041504150415 = 75;
                break;

            case 0: // '\0'
                break;
            }
        } while (true);
        return null;
    }

    public static int b042704270427042704270427()
    {
        return 19;
    }
}
