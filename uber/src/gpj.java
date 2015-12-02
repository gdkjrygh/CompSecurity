// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class gpj extends gpl
{

    private gpk a;

    public gpj()
    {
    }

    public final void a(gpk gpk1)
    {
        a = gpk1;
    }

    public final void afterTextChanged(Editable editable)
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        super.afterTextChanged(editable);
        String s = null;
        Object obj;
        Object obj1;
        obj = bmr.a();
        obj1 = bmr.e(a());
_L1:
        if (i >= editable.toString().length())
        {
            break MISSING_BLOCK_LABEL_61;
        }
        s = ((bmk) (obj1)).a(editable.toString().charAt(i));
        i++;
          goto _L1
        if (s != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        obj1 = Pattern.compile("^\\+(\\d\\d?\\d?).*$").matcher(s);
        if (!((Matcher) (obj1)).matches()) goto _L2; else goto _L4
_L4:
        obj = ((bmr) (obj)).b(Integer.parseInt(((Matcher) (obj1)).group(1)));
        if (((String) (obj)).equals("ZZ") || a == null) goto _L2; else goto _L5
_L5:
        a.b_(((String) (obj)));
        if (((Matcher) (obj1)).end(1) >= s.length() || !Character.isSpaceChar(s.charAt(((Matcher) (obj1)).end(1))))
        {
            break MISSING_BLOCK_LABEL_184;
        }
        i = ((Matcher) (obj1)).end(1) + 1;
_L6:
        editable.delete(0, i);
          goto _L2
        editable;
        throw editable;
        i = ((Matcher) (obj1)).end(1);
          goto _L6
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
    }
}
