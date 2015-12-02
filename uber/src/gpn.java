// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.locale.phone.PhoneNumberView;

public final class gpn
    implements hrt
{

    private final hsa a;
    private final gpo b;
    private Object c;

    public gpn(Object obj)
    {
        this(obj, gpo.a);
    }

    public gpn(Object obj, gpo gpo1)
    {
        c = obj;
        b = gpo1;
        a = new hsa(c);
    }

    private Object a(PhoneNumberView phonenumberview)
    {
        CharSequence charsequence;
        bmr bmr1;
        charsequence = phonenumberview.a();
        if (charsequence == null || !b.equals(gpo.b))
        {
            break MISSING_BLOCK_LABEL_62;
        }
        bmr1 = bmr.a();
        if (bmr1.a(bmr1.a(charsequence.toString(), phonenumberview.d())))
        {
            return null;
        }
        try
        {
            phonenumberview = ((PhoneNumberView) (c));
        }
        // Misplaced declaration of an exception variable
        catch (PhoneNumberView phonenumberview)
        {
            return c;
        }
        return phonenumberview;
        return a.a(phonenumberview);
    }

    public final volatile Object a(Object obj)
    {
        return a((PhoneNumberView)obj);
    }
}
