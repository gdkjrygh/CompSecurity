// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import uuuuuu.nuuuuu;

public final class NotificationAction extends Enum
{

    private static final NotificationAction $VALUES[];
    public static final NotificationAction ACTION_ACCESS_TOKEN_ABOUT_TO_EXPIRE;
    public static final NotificationAction ACTION_ACCESS_TOKEN_EXPIRED;
    public static final NotificationAction ACTION_CHECK_STATUS_FAIL;
    public static final NotificationAction ACTION_REPLENISH;
    public static final NotificationAction ACTION_REPLENISH_FAIL;
    public static final NotificationAction ACTION_REPLENISH_SUCCESS;
    public static final NotificationAction ACTION_SELECTED_CARD_DELETED;
    public static final NotificationAction ACTION_TOKEN_UPDATED;
    public static int b043B043B043B043B043B043B = 2;
    public static int b043B043B043B043B043B043B = 0;
    public static int b043B043B043B043B043B043B = 1;
    public static int b043B043B043B043B043B043B = 36;
    private static final HashMap map;
    private int code;

    private NotificationAction(String s, int i, int j)
    {
        super(s, i);
        code = j;
    }

    public static int b043B043B043B043B043B043B()
    {
        return 0;
    }

    public static int b043B043B043B043B043B043B()
    {
        return 95;
    }

    public static int b043B043B043B043B043B043B()
    {
        return 2;
    }

    public static NotificationAction get(int i)
    {
        Object obj = map;
        Object obj1 = java/lang/Integer.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB0\uFF9B\uFFA6\uFFAF\uFF9F\uFF89\uFFA0", 'B', '\004'), new Class[] {
            Integer.TYPE
        });
        Method method;
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[] {
                Integer.valueOf(i)
            });
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        obj1 = (Integer)obj1;
        method = java/util/HashMap.getMethod(nuuuuu.b0417041704170417041704170417("\343\341\360", '>', '\001'), new Class[] {
            java/lang/Object
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        obj = (NotificationAction)(Object)obj;
        if (((b043B043B043B043B043B043B + b043B043B043B043B043B043B) * b043B043B043B043B043B043B) % b043B043B043B043B043B043B != b043B043B043B043B043B043B)
        {
            b043B043B043B043B043B043B = 63;
            if (((b043B043B043B043B043B043B + b043B043B043B043B043B043B) * b043B043B043B043B043B043B) % b043B043B043B043B043B043B != b043B043B043B043B043B043B)
            {
                Object obj2 = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\uFE94\u026D\u026D\uFE62\uFE66\uFE65\uFE74\uFE62\uFE66\uFE65\uFE74\u026D\u026D", '\232', '\004'), new Class[0]);
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b043B043B043B043B043B043B = ((Integer)obj2).intValue();
                b043B043B043B043B043B043B = 72;
            }
            b043B043B043B043B043B043B = 14;
        }
        return ((NotificationAction) (obj));
    }

    public static NotificationAction valueOf(String s)
    {
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b043B043B043B043B043B043B;
            j = b043B043B043B043B043B043B;
            k = b043B043B043B043B043B043B;
            l = b043B043B043B043B043B043B;
            i1 = b043B043B043B043B043B043B;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417(">\u0467\u0467lho\036lho\036\u0467\u0467", '\\', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b043B043B043B043B043B043B = i;
        obj = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\u01A3\u057C\u057C\u0171\u0175\u0174\u0183\u0171\u0175\u0174\u0183\u057C\u057C", 'k', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b043B043B043B043B043B043B = i;
        i = b043B043B043B043B043B043B;
        switch ((i * (b043B043B043B043B043B043B + i)) % b043B043B043B043B043B043B)
        {
        default:
            b043B043B043B043B043B043B = 47;
            b043B043B043B043B043B043B = 28;
            // fall through

        case 0: // '\0'
            obj = java/lang/Enum.getMethod(nuuuuu.b0417041704170417041704170417("\u0246\u0231\u023C\u0245\u0235\u021F\u0236", '\350', '\001'), new Class[] {
                java/lang/Class, java/lang/String
            });
            break;
        }
        s = ((String) (((Method) (obj)).invoke(null, new Object[] {
            com/visa/cbp/sdk/facade/data/NotificationAction, s
        })));
        s = (Enum)s;
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
        try
        {
            s = (NotificationAction)s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        return s;
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        s;
        throw s.getCause();
    }

    public static NotificationAction[] values()
    {
        return (NotificationAction[])$VALUES.clone();
    }

    public int getCode()
    {
label0:
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
        Object obj;
        InvocationTargetException invocationtargetexception;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b043B043B043B043B043B043B;
            j = b043B043B043B043B043B043B;
            k = b043B043B043B043B043B043B;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\001\u0458\u0458\u0458\u0458SWP!\u0458", 'c', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        l = ((Integer)obj).intValue();
        i1 = b043B043B043B043B043B043B;
        if ((k * (i + j)) % l == i1)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        if (((b043B043B043B043B043B043B + b043B043B043B043B043B043B) * b043B043B043B043B043B043B) % b043B043B043B043B043B043B != b043B043B043B043B043B043B)
        {
            b043B043B043B043B043B043B = 41;
            b043B043B043B043B043B043B = 68;
        }
        obj = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\u0269\u0642\u0642\u0237\u023B\u023A\u0249\u0237\u023B\u023A\u0249\u0642\u0642", '\255', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b043B043B043B043B043B043B = i;
        obj = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDB\u03B4\u03B4\uFFA9\uFFAD\uFFAC\uFFBB\uFFA9\uFFAD\uFFAC\uFFBB\u03B4\u03B4", '?', 'H', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b043B043B043B043B043B043B = i;
        InvocationTargetException invocationtargetexception1;
        try
        {
            i = code;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        return i;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
    }

    static 
    {
        Object obj;
        int i;
        int k;
        try
        {
            ACTION_REPLENISH_FAIL = new NotificationAction("ACTION_REPLENISH_FAIL", 0, 1);
        }
        catch (Exception exception)
        {
            try
            {
                throw exception;
            }
            catch (Exception exception1)
            {
                throw exception1;
            }
        }
        obj = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\234\u0475\u0475jnm|jnm|\u0475\u0475", '\035', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj).intValue();
        k = b043B043B043B043B043B043B;
        obj = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\uFF56\u032F\u032F\uFF24\uFF28\uFF27\uFF36\uFF24\uFF28\uFF27\uFF36\u032F\u032F", '\206', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if ((((Integer)obj).intValue() * (k + i)) % b043B043B043B043B043B043B != b043B043B043B043B043B043B)
        {
            Object obj1 = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\u0248\u0621\u0621\u0216\u021A\u0219\u0228\u0216\u021A\u0219\u0228\u0621\u0621", '\242', '\006'), new Class[0]);
            NotificationAction anotificationaction[];
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            NotificationAction notificationaction;
            NotificationAction notificationaction1;
            NotificationAction notificationaction2;
            int j;
            int l;
            int i1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b043B043B043B043B043B043B = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("w\u0450\u0450EIHWEIHW\u0450\u0450", '-', 'B', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b043B043B043B043B043B043B = ((Integer)obj1).intValue();
        }
        ACTION_CHECK_STATUS_FAIL = new NotificationAction("ACTION_CHECK_STATUS_FAIL", 1, 2);
        ACTION_SELECTED_CARD_DELETED = new NotificationAction("ACTION_SELECTED_CARD_DELETED", 2, 3);
        ACTION_ACCESS_TOKEN_ABOUT_TO_EXPIRE = new NotificationAction("ACTION_ACCESS_TOKEN_ABOUT_TO_EXPIRE", 3, 4);
        ACTION_ACCESS_TOKEN_EXPIRED = new NotificationAction("ACTION_ACCESS_TOKEN_EXPIRED", 4, 5);
        if (((b043B043B043B043B043B043B + b043B043B043B043B043B043B) * b043B043B043B043B043B043B) % b043B043B043B043B043B043B == b043B043B043B043B043B043B)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        b043B043B043B043B043B043B = 30;
        obj1 = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\273\u04E2\u04E2\351\355\352\233\351\355\352\233\u04E2\u04E2", '\331', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        j = ((Integer)obj1).intValue();
        try
        {
            b043B043B043B043B043B043B = j;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw obj2;
        }
        ACTION_TOKEN_UPDATED = new NotificationAction("ACTION_TOKEN_UPDATED", 5, 6);
        ACTION_REPLENISH = new NotificationAction("ACTION_REPLENISH", 6, 7);
        ACTION_REPLENISH_SUCCESS = new NotificationAction("ACTION_REPLENISH_SUCCESS", 7, 8);
        obj1 = ACTION_REPLENISH_FAIL;
        obj3 = ACTION_CHECK_STATUS_FAIL;
        obj4 = ACTION_SELECTED_CARD_DELETED;
        obj5 = ACTION_ACCESS_TOKEN_ABOUT_TO_EXPIRE;
        obj6 = ACTION_ACCESS_TOKEN_EXPIRED;
        notificationaction = ACTION_TOKEN_UPDATED;
        notificationaction1 = ACTION_REPLENISH;
        notificationaction2 = ACTION_REPLENISH_SUCCESS;
        $VALUES = (new NotificationAction[] {
            obj1, obj3, obj4, obj5, obj6, notificationaction, notificationaction1, notificationaction2
        });
        obj1 = new HashMap();
        map = ((HashMap) (obj1));
        obj1 = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\251\276\263\252\272\254", '\337', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        anotificationaction = (NotificationAction[])obj1;
        l = anotificationaction.length;
        j = 0;
_L2:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = anotificationaction[j];
        obj4 = map;
        obj5 = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\u0191\u018F\u019E\u016D\u0199\u018E\u018F", '\225', '\001'), new Class[0]);
        obj5 = ((Method) (obj5)).invoke(obj3, new Object[0]);
        i1 = ((Integer)obj5).intValue();
        obj5 = java/lang/Integer.getMethod(nuuuuu.b0417041704170417041704170417("\uFFED\uFFD8\uFFE3\uFFEC\uFFDC\uFFC6\uFFDD", '%', '\256', '\002'), new Class[] {
            Integer.TYPE
        });
        obj5 = ((Method) (obj5)).invoke(null, new Object[] {
            Integer.valueOf(i1)
        });
        obj5 = (Integer)obj5;
        obj6 = java/util/HashMap.getMethod(nuuuuu.b0417041704170417041704170417("vsr", '\006', '\002'), new Class[] {
            java/lang/Object, java/lang/Object
        });
        obj3 = ((Method) (obj6)).invoke(obj4, new Object[] {
            obj5, obj3
        });
        obj3 = (Object)obj3;
        j++;
        if (true) goto _L2; else goto _L1
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        obj2;
        throw obj2;
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
_L1:
    }
}
