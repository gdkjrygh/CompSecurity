// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.content.Context;
import com.visa.cbp.sdk.facade.api.DeviceRegRestAdapter;
import com.visa.cbp.sdk.facade.data.DeviceData;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.error.ReasonCode;
import com.visa.cbp.sdk.facade.error.SDKErrorType;
import com.visa.cbp.sdk.facade.provider.Provider;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import com.visa.cbp.sdk.facade.request.DeviceRegistrationRequest;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import retrofit.Callback;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            llplll, rgrgrr, grrrrr, ppplpp, 
//            pplllp, grgrgr, rgrgrg, lppllp, 
//            grrgrg, lpplll

public abstract class lplplp
    implements Provider
{

    public static int b044304430443044304430443_int_static_fld = 3;
    public static int b044304430443044304430443_int_static_fld = 0;
    public static final String b044304430443044304430443_java_lang_String_static_fld;
    public static int b044304430443044304430443_int_static_fld = 2;
    public static int b044304430443044304430443_int_static_fld = 1;
    private grrgrg b044304430443044304430443_rrrrrr_grrgrg_fld;

    public lplplp()
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int b0421042104210421042104210421()
    {
        return 2;
    }

    public static int b0421042104210421042104210421()
    {
        return 26;
    }

    public static int b0421042104210421042104210421()
    {
        return 0;
    }

    public void b0421042104210421042104210421(Object obj, ResponseCallback responsecallback, String s)
    {
        Object obj1;
        Object obj2;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            s = new DeviceRegistrationRequest(new DeviceData(), s);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj1 = rrrrrr/llplll.getMethod(nuuuuu.b0417041704170417041704170417("\uFF51\u0336\u0336\uFF1F\uFF23\uFF23\uFF26\u0336\u0336\uFF1F\uFF23\uFF23\uFF26", '&', '\353', '\0'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        obj1 = (llplll)obj1;
        try
        {
            obj1 = ((llplll) (obj1)).b043604360436043604360436();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
label0:
        do
        {
            switch (1)
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
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        obj2 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\007\uFFD5\uFFD9\uFFD7\uFFD6\u03C6\uFFD5\uFFD9\uFFD7\uFFD6\u03C6\u03C6\u03C6\uFFD5\uFFD9\uFFD7\uFFD6", '\220', '\353', '\002'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        i = ((Integer)obj2).intValue();
        j = b044304430443044304430443_int_static_fld;
        obj2 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\u033B\u0309\u030D\u030B\u030A\u06FA\u0309\u030D\u030B\u030A\u06FA\u06FA\u06FA\u0309\u030D\u030B\u030A", '\363', '\006'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        k = ((Integer)obj2).intValue();
        l = b044304430443044304430443_int_static_fld;
        i1 = b044304430443044304430443_int_static_fld;
        if ((k * (j + i)) % l == i1)
        {
            break MISSING_BLOCK_LABEL_445;
        }
        i = b044304430443044304430443_int_static_fld;
        j = b044304430443044304430443_int_static_fld;
        k = b044304430443044304430443_int_static_fld;
        obj2 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\u02E1\u02AF\u02B3\u02B1\u02B0\u02AF\u02B3\u02B1\u02B0\u02AF\u02B3\u02B1\u02B0\u06A0\u06A0\u06A0\u02AF\u02B3\u02B1\u02B0", '\325', '\006'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        if ((k * (i + j)) % ((Integer)obj2).intValue() != b044304430443044304430443_int_static_fld)
        {
            obj2 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("l>:<?\u042F>:<?\u042F\u042F\u042F>:<?", '\016', '\002'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b044304430443044304430443_int_static_fld = ((Integer)obj2).intValue();
            b044304430443044304430443_int_static_fld = 52;
        }
        obj2 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\uFF60\uFF2E\uFF32\uFF30\uFF2F\u031F\uFF2E\uFF32\uFF30\uFF2F\u031F\u031F\u031F\uFF2E\uFF32\uFF30\uFF2F", '\201', '\003'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        i = ((Integer)obj2).intValue();
        b044304430443044304430443_int_static_fld = i;
        obj2 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\321\237\243\241\240\u0490\237\243\241\240\u0490\u0490\u0490\237\243\241\240", 'o', '\005'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        i = ((Integer)obj2).intValue();
        b044304430443044304430443_int_static_fld = i;
        obj = new rgrgrr(this, s, obj, responsecallback);
        responsecallback = com/visa/cbp/sdk/facade/api/DeviceRegRestAdapter.getMethod(nuuuuu.b0417041704170417041704170417("\316\301\303\305\317\320\301\316", '.', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/request/DeviceRegistrationRequest, retrofit/Callback
        });
        responsecallback.invoke(obj1, new Object[] {
            s, obj
        });
        return;
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

    public boolean b0421042104210421042104210421(long l)
    {
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
        Object obj = java/lang/System.getMethod(nuuuuu.b0417041704170417041704170417("\u0315\u0327\u0324\u0324\u0317\u0320\u0326\u0306\u031B\u031F\u0317\u02FF\u031B\u031E\u031E\u031B\u0325", '\346', '\006'), new Class[0]);
        long l1;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        l1 = ((Long)obj).longValue();
        if (l > -1L)
        {
            if (l - l1 > 0L)
            {
                if (((b044304430443044304430443_int_static_fld + b044304430443044304430443_int_static_fld) * b044304430443044304430443_int_static_fld) % b044304430443044304430443_int_static_fld != b044304430443044304430443_int_static_fld)
                {
                    b044304430443044304430443_int_static_fld = 51;
                    if (((b044304430443044304430443_int_static_fld + b044304430443044304430443_int_static_fld) * b044304430443044304430443_int_static_fld) % b044304430443044304430443_int_static_fld != b044304430443044304430443_int_static_fld)
                    {
                        b044304430443044304430443_int_static_fld = 36;
                        Object obj1 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\uFF82\uFF50\uFF54\uFF52\uFF51\u0341\uFF50\uFF54\uFF52\uFF51\u0341\u0341\u0341\uFF50\uFF54\uFF52\uFF51", 'p', '\003'), new Class[0]);
                        try
                        {
                            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                        }
                        catch (InvocationTargetException invocationtargetexception1)
                        {
                            throw invocationtargetexception1.getCause();
                        }
                        b044304430443044304430443_int_static_fld = ((Integer)obj1).intValue();
                    }
                    b044304430443044304430443_int_static_fld = 28;
                    return false;
                } else
                {
                    return false;
                }
            } else
            {
                return true;
            }
        } else
        {
            return true;
        }
    }

    public abstract void b042B042B042B042B042B042B(Object obj, ResponseCallback responsecallback);

    public abstract void b042B042B042B042B042B042B(CbpError cbperror, ResponseCallback responsecallback);

    public void doRequest(Object obj, ResponseCallback responsecallback)
    {
_L2:
        Object obj1 = b044304430443044304430443_java_lang_String_static_fld;
        Object obj3 = grrrrr.b044C044C044C044C044C044C("\uFEF9\uFF25\uFF24\uFF2C\uFF1B\uFF28\uFF29\uFF17\uFF2A\uFF1F\uFF25\uFF24\uFED6\uFF1F\uFF1A\uFED6\uFF1B\uFF2E\uFF26\uFF1F\uFF28\uFF1B\uFF1A\uFEE4\uFED6\uFF03\uFF17\uFF21\uFF1F\uFF24\uFF1D\uFED6\uFF1A\uFF1B\uFF2C\uFF1F\uFF19\uFF1B\uFED6\uFF28\uFF1B\uFF1D\uFF1F\uFF29\uFF2A\uFF28\uFF17\uFF2A\uFF1F\uFF25\uFF24\uFED6\uFF19\uFF17\uFF22\uFF22\uFEE4", '\245', '\003');
        Object obj4 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\u012A\u04DD\u04DD\370\374\371\375\370\374\371\375\370\374\371\375\u04DD\370\374\371\375", '\300', '\b', '\003'), new Class[] {
            java/lang/String, java/lang/String
        });
        Object obj2;
        Object obj5;
        Method method;
        int j;
        int k;
        long l;
        try
        {
            ((Method) (obj4)).invoke(null, new Object[] {
                obj1, obj3
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj1 = new pplllp(b044304430443044304430443_rrrrrr_grrgrg_fld);
        obj3 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("2\000\004\002\022\u03FB\u03FB\u03FB\u03FB\000\004\002\022", '0', '\0'), new Class[0]);
        try
        {
            obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj3 = (Context)obj3;
        obj4 = rrrrrr/pplllp.getMethod(nuuuuu.b0417041704170417041704170417("\uFE2E\uFDFC\uFE00\uFDFE\uFDFD\uFDFC\uFE00\uFDFE\uFDFD\u01ED\u01ED\u01ED\uFDFC\uFE00\uFDFE\uFDFD\u01ED", '\274', '\004'), new Class[] {
            android/content/Context
        });
        try
        {
            ((Method) (obj4)).invoke(obj1, new Object[] {
                obj3
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj3 = rrrrrr/pplllp.getMethod(nuuuuu.b0417041704170417041704170417("\u010F\u04CE\u04CE\u04CE\335\341\337\336\u04CE\335\341\337\336\u04CE", '4', 'y', '\003'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj3)).invoke(obj1, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj1 = (String)obj1;
        obj3 = b044304430443044304430443_java_lang_String_static_fld;
        obj4 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\000\uFFCE\uFFD2\uFFD0\uFFCF\u03BF\uFFCE\uFFD2\uFFD0\uFFCF\u03BF\u03BF\u03BF\uFFCE\uFFD2\uFFD0\uFFCF", 'b', '\0'), new Class[0]);
        try
        {
            obj4 = ((Method) (obj4)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        j = ((Integer)obj4).intValue();
        k = b044304430443044304430443_int_static_fld;
        obj4 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\uFF5E\uFF2C\uFF30\uFF2E\uFF2D\u031D\uFF2C\uFF30\uFF2E\uFF2D\u031D\u031D\u031D\uFF2C\uFF30\uFF2E\uFF2D", '\202', '\003'), new Class[0]);
        try
        {
            obj4 = ((Method) (obj4)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        if ((((Integer)obj4).intValue() * (k + j)) % b044304430443044304430443_int_static_fld != b044304430443044304430443_int_static_fld)
        {
            b044304430443044304430443_int_static_fld = 73;
        }
        obj4 = new StringBuilder();
        obj5 = grrrrr.b044C044C044C044C044C044C("*K\\OIK\006YKYYOUT\006OJ \006", '\r', '\003');
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF3\002\002\uFFF7\000\uFFF6", 'n', '\0'), new Class[] {
            java/lang/String
        });
        try
        {
            obj4 = method.invoke(obj4, new Object[] {
                obj5
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj4 = (StringBuilder)obj4;
        obj5 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\324\343\343\330\341\327", 's', '\005'), new Class[] {
            java/lang/String
        });
        try
        {
            obj4 = ((Method) (obj5)).invoke(obj4, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj4 = (StringBuilder)obj4;
        obj5 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\234\227{\234\232\221\226\217", '\305', '\235', '\002'), new Class[0]);
        try
        {
            obj4 = ((Method) (obj5)).invoke(obj4, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj4 = (String)obj4;
        obj5 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\uFF07\u02BA\u02BA\uFED5\uFED9\uFED6\uFEDA\uFED5\uFED9\uFED6\uFEDA\uFED5\uFED9\uFED6\uFEDA\u02BA\uFED5\uFED9\uFED6\uFEDA", '\356', 'm', '\0'), new Class[] {
            java/lang/String, java/lang/String
        });
        try
        {
            ((Method) (obj5)).invoke(null, new Object[] {
                obj3, obj4
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj3 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\204\326\322\324\327\u04C7\u04C7\326\322\324\327\u04C7\u04C7\326\322\324\327", '\346', '\002'), new Class[] {
            java/lang/Object, com/visa/cbp/sdk/facade/provider/ResponseCallback, java/lang/String
        });
        try
        {
            ((Method) (obj3)).invoke(this, new Object[] {
                obj, responsecallback, obj1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
_L6:
        l = -1L;
_L7:
        obj1 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\u0356\u0715\u0715\u0715\u0324\u0328\u0326\u0325\u0715\u0715\u0324\u0328\u0326\u0325", '\374', '\006'), new Class[] {
            Long.TYPE
        });
        try
        {
            obj1 = ((Method) (obj1)).invoke(this, new Object[] {
                Long.valueOf(l)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        if (((Boolean)obj1).booleanValue()) goto _L2; else goto _L1
_L1:
        obj1 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\u01F4\u05BD\u01C2\u01C6\u01C4\u01D4\u05BD\u05BD\u01C2\u01C6\u01C4\u01D4\u05BD", '\206', '\006'), new Class[] {
            java/lang/Object, com/visa/cbp/sdk/facade/provider/ResponseCallback
        });
        try
        {
            ((Method) (obj1)).invoke(this, new Object[] {
                obj, responsecallback
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj = b044304430443044304430443_java_lang_String_static_fld;
        responsecallback = grrrrr.b044C044C044C044C044C044C("\027CBJ9FG5H=CB\uFFF4=8\uFFF4BCH\uFFF49LD=F98\uFFF5", 'u', 'I', '\001');
        obj1 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\uFFAB\u035E\u035E\uFF79\uFF7D\uFF7A\uFF7E\uFF79\uFF7D\uFF7A\uFF7E\uFF79\uFF7D\uFF7A\uFF7E\u035E\uFF79\uFF7D\uFF7A\uFF7E", '\004', '\263', '\0'), new Class[] {
            java/lang/String, java/lang/String
        });
        try
        {
            ((Method) (obj1)).invoke(null, new Object[] {
                obj, responsecallback
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        l = -1L;
_L8:
        obj3 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("_\u041E\u041E\u041E-1/.\u041E\u041E-1/.", '\003', '\0'), new Class[] {
            Long.TYPE
        });
        try
        {
            obj3 = ((Method) (obj3)).invoke(this, new Object[] {
                Long.valueOf(l)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        if (((Boolean)obj3).booleanValue()) goto _L4; else goto _L3
_L3:
        if (obj2 == null) goto _L6; else goto _L5
_L5:
        obj3 = rrrrrr/rgrgrg.getMethod(nuuuuu.b0417041704170417041704170417("q#'!$#'!$\u0434\u0434#'!$\u0434", '\023', '\002'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj3)).invoke(obj2, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        l = ((Long)obj2).longValue();
          goto _L7
        int i = 4;
        try
        {
            do
            {
                i /= 0;
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            obj2 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFEF6\uFEC4\uFEC8\uFEC6\uFED6\u02BF\u02BF\u02BF\u02BF\uFEC4\uFEC8\uFEC6\uFED6", '\351', '\203', '\0'), new Class[0]);
        }
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        b044304430443044304430443_rrrrrr_grrgrg_fld = new lppllp((Context)obj2);
        obj2 = b044304430443044304430443_rrrrrr_grrgrg_fld;
        obj3 = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\370\252\256\250\255\252\256\250\255\252\256\250\255\u04BD\u04BD\u04BD", '\232', '\002'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj3)).invoke(obj2, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj2 = (rgrgrg)obj2;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_785;
        }
        obj3 = rrrrrr/rgrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u02E4\u06A9\u06A9\u02B2\u02B6\u02B4\u02B9\u02B2\u02B6\u02B4\u02B9\u02B2\u02B6\u02B4\u02B9\u06A9", '\326', '\006'), new Class[0]);
        try
        {
            obj3 = ((Method) (obj3)).invoke(obj2, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        l = ((Long)obj3).longValue();
          goto _L8
_L4:
        obj = SDKErrorType.EXPIRED_SERVICE;
        obj2 = ReasonCode.AUTHENTICATION_ERROR;
_L16:
        0;
        JVM INSTR tableswitch 0 1: default 1104
    //                   0 1131
    //                   1 1080;
           goto _L9 _L10 _L11
_L11:
        continue; /* Loop/switch isn't completed */
_L9:
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
_L10:
        0;
        JVM INSTR tableswitch 0 1: default 1156
    //                   0 1183
    //                   1 1080;
           goto _L12 _L13 _L14
_L14:
        continue; /* Loop/switch isn't completed */
_L13:
        break; /* Loop/switch isn't completed */
_L12:
        while (true) 
        {
            switch (0)
            {
            default:
                break;

            case 0: // '\0'
                break; /* Loop/switch isn't completed */

            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
        }
        if (true) goto _L16; else goto _L15
_L15:
        obj3 = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("\u0239\u0207\u020B\u020B\u020E\u0207\u020B\u020B\u020E\u061E\u0207\u020B\u020B\u020E\u061E\u0207\u020B\u020B\u020E", '\235', '\006'), new Class[] {
            com/visa/cbp/sdk/facade/error/SDKErrorType, com/visa/cbp/sdk/facade/error/ReasonCode
        });
        obj = ((Method) (obj3)).invoke(null, new Object[] {
            obj, obj2
        });
        obj = (CbpError)obj;
        obj2 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("f\u042F\u042F486F\u042F486F\u042F", '\027', '\023', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError, com/visa/cbp/sdk/facade/provider/ResponseCallback
        });
        try
        {
            ((Method) (obj2)).invoke(this, new Object[] {
                obj, responsecallback
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
          goto _L7
    }

    static 
    {
        Object obj = java/lang/Class.getMethod(nuuuuu.b0417041704170417041704170417("\366\364\u0103\335\360\374\364", '\217', '\005'), new Class[0]);
        obj = ((Method) (obj)).invoke(rrrrrr/lplplp, new Object[0]);
        obj = (String)obj;
        InvocationTargetException invocationtargetexception;
        Object obj1;
        int i;
        int j;
        try
        {
            i = b044304430443044304430443_int_static_fld;
            j = b044304430443044304430443_int_static_fld;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj1 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\uFEC4\uFE92\uFE96\uFE94\uFE93\uFE92\uFE96\uFE94\uFE93\uFE92\uFE96\uFE94\uFE93\u0283\u0283\u0283\uFE92\uFE96\uFE94\uFE93", '\317', '\003'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        ((j + i) * i) % ((Integer)obj1).intValue();
        JVM INSTR tableswitch 0 0: default 104
    //                   0 150;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_150;
_L1:
        obj1 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\uFD89\uFD57\uFD5B\uFD59\uFD58\u0148\uFD57\uFD5B\uFD59\uFD58\u0148\u0148\u0148\uFD57\uFD5B\uFD59\uFD58", '\363', '\004'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        InvocationTargetException invocationtargetexception1;
        try
        {
            b044304430443044304430443_int_static_fld = i;
            b044304430443044304430443_int_static_fld = 72;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        if (((b044304430443044304430443_int_static_fld + b044304430443044304430443_int_static_fld) * b044304430443044304430443_int_static_fld) % b044304430443044304430443_int_static_fld != b044304430443044304430443_int_static_fld)
        {
            obj1 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\uFED0\uFE9E\uFEA2\uFEA0\uFE9F\u028F\uFE9E\uFEA2\uFEA0\uFE9F\u028F\u028F\u028F\uFE9E\uFEA2\uFEA0\uFE9F", '\206', '\004'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b044304430443044304430443_int_static_fld = ((Integer)obj1).intValue();
            b044304430443044304430443_int_static_fld = 77;
        }
        switch (1)
        {
        default:
label0:
            do
            {
                switch (0)
                {
                case 0: // '\0'
                    break label0;

                case 1: // '\001'
                    break MISSING_BLOCK_LABEL_150;
                }
            } while (true);
            break;

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_150;

        case 1: // '\001'
            break;
        }
        b044304430443044304430443_java_lang_String_static_fld = ((String) (obj));
        return;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
    }
}
