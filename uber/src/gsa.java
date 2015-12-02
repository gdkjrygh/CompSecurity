// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.ubercab.payment.internal.model.PaymentEditOptions;
import com.ubercab.payment.model.PaymentAddOptions;
import com.ubercab.payment.model.PaymentError;
import com.ubercab.payment.model.PaymentProfile;
import com.ubercab.payment.model.PaymentUserInfo;

public abstract class gsa
{

    private Context a;
    private gmg b;
    private Resources c;

    public gsa(Context context)
    {
        a = context;
        c = context.getResources();
        b = ((grz)context.getApplicationContext()).e().f();
    }

    public static gsa a(Context context, String s1)
    {
        byte byte0;
        if (s1 == null)
        {
            return null;
        }
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 9: default 96
    //                   -1414960566: 173
    //                   -995205389: 243
    //                   -920235116: 229
    //                   -523793033: 273
    //                   -384049774: 159
    //                   3046195: 215
    //                   825497556: 258
    //                   1702338205: 187
    //                   1753484823: 201;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_273;
_L11:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            return new gvt(context);

        case 1: // '\001'
            return new gxk(context);

        case 2: // '\002'
            return new gxl(context);

        case 3: // '\003'
            return new gxu(context);

        case 4: // '\004'
            return new gxz(context);

        case 5: // '\005'
            return new gym(context);

        case 6: // '\006'
            return new gyw(context);

        case 7: // '\007'
            return new gzc(context);

        case 8: // '\b'
            return new gzi(context);
        }
_L6:
        if (s1.equals("airtel_money"))
        {
            byte0 = 0;
        }
          goto _L11
_L2:
        if (s1.equals("alipay"))
        {
            byte0 = 1;
        }
          goto _L11
_L9:
        if (s1.equals("baidu_wallet"))
        {
            byte0 = 2;
        }
          goto _L11
_L10:
        if (s1.equals("payment_type_candidate"))
        {
            byte0 = 3;
        }
          goto _L11
_L7:
        if (s1.equals("cash"))
        {
            byte0 = 4;
        }
          goto _L11
_L4:
        if (s1.equals("braintree"))
        {
            byte0 = 5;
        }
          goto _L11
_L3:
        if (s1.equals("paypal"))
        {
            byte0 = 6;
        }
          goto _L11
_L8:
        if (s1.equals("lianlian"))
        {
            byte0 = 7;
        }
          goto _L11
        if (s1.equals("zaakpay"))
        {
            byte0 = 8;
        }
          goto _L11
    }

    public final Intent a(Intent intent, String s1, PaymentUserInfo paymentuserinfo)
    {
        gjz.a(a);
        gjz.a(intent);
        gjz.a(s1);
        Intent intent1 = new Intent(a, e());
        intent1.setPackage(a.getPackageName());
        intent1.putExtra("data_collection_action_label", s1);
        intent1.putExtra("mode", "data_collection");
        intent1.putExtra("collected_data_intent", intent);
        intent1.putExtra("user_info", paymentuserinfo);
        return intent1;
    }

    public final Intent a(PaymentProfile paymentprofile)
    {
        gjz.a(a);
        gjz.a(paymentprofile);
        Intent intent = new Intent(a, g());
        intent.setPackage(a.getPackageName());
        intent.putExtra("payment_profile", paymentprofile);
        return intent;
    }

    public final Intent a(PaymentProfile paymentprofile, PaymentEditOptions paymenteditoptions)
    {
        gjz.a(a);
        gjz.a(paymentprofile);
        Intent intent = new Intent(a, f());
        intent.setPackage(a.getPackageName());
        intent.putExtra("payment_profile", paymentprofile);
        intent.putExtra("payment_edit_options", paymenteditoptions);
        return intent;
    }

    public final Intent a(PaymentProfile paymentprofile, PaymentError paymenterror)
    {
        gjz.a(a);
        gjz.a(paymentprofile);
        if (!a(paymenterror))
        {
            throw new IllegalArgumentException("The given error is not handled by this payment type.");
        } else
        {
            Intent intent = new Intent(a, k());
            intent.setPackage(a.getPackageName());
            intent.putExtra("error", paymenterror);
            intent.putExtra("payment_profile", paymentprofile);
            return intent;
        }
    }

    public final Intent a(PaymentProfile paymentprofile, String s1)
    {
        gjz.a(a);
        gjz.a(paymentprofile);
        gjz.a(s1);
        Intent intent = new Intent(a, i());
        intent.setPackage(a.getPackageName());
        intent.putExtra("payment_profile", paymentprofile);
        intent.putExtra("bill_uuid", s1);
        return intent;
    }

    public final Intent a(PaymentUserInfo paymentuserinfo, PaymentAddOptions paymentaddoptions)
    {
        gjz.a(a);
        Intent intent = new Intent(a, e());
        intent.setPackage(a.getPackageName());
        intent.putExtra("mode", "add");
        intent.putExtra("user_info", paymentuserinfo);
        intent.putExtra("payment_add_options", paymentaddoptions);
        return intent;
    }

    public abstract String a();

    public boolean a(PaymentError paymenterror)
    {
        return false;
    }

    public final Intent b(PaymentProfile paymentprofile)
    {
        gjz.a(a);
        gjz.a(paymentprofile);
        Intent intent = new Intent(a, h());
        intent.setPackage(a.getPackageName());
        intent.putExtra("payment_profile", paymentprofile);
        return intent;
    }

    public final Intent b(PaymentProfile paymentprofile, String s1)
    {
        gjz.a(a);
        gjz.a(paymentprofile);
        Intent intent = new Intent(a, j());
        intent.setPackage(a.getPackageName());
        intent.putExtra("payment_profile", paymentprofile);
        if (!TextUtils.isEmpty(s1))
        {
            intent.putExtra("verification_code", s1);
        }
        return intent;
    }

    public abstract String b();

    public final Intent c(PaymentProfile paymentprofile)
    {
        gjz.a(a);
        gjz.a(paymentprofile);
        return b(paymentprofile, null);
    }

    public abstract Drawable c();

    public abstract Drawable d();

    protected abstract Class e();

    protected abstract Class f();

    protected abstract Class g();

    protected abstract Class h();

    protected abstract Class i();

    protected abstract Class j();

    protected abstract Class k();

    protected final Context l()
    {
        return a;
    }

    protected final Resources m()
    {
        return c;
    }

    protected final gmg n()
    {
        return b;
    }

    public final boolean o()
    {
        return e() != null;
    }

    public final boolean p()
    {
        return f() != null;
    }

    public final boolean q()
    {
        return g() != null;
    }

    public final boolean r()
    {
        return i() != null;
    }

    public final boolean s()
    {
        return j() != null;
    }
}
