// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

// Referenced classes of package com.whatsapp:
//            App, VerifySms, abk, asw

class akb
    implements TextWatcher
{

    final VerifySms a;
    private String b;

    akb(VerifySms verifysms)
    {
        a = verifysms;
        super();
        b = "";
    }

    public void afterTextChanged(Editable editable)
    {
        Object obj;
        int i;
        int i1;
        int j1;
label0:
        {
            i1 = App.am;
            VerifySms.p(a).removeTextChangedListener(this);
            i = VerifySms.p(a).getSelectionStart();
            obj = editable.toString().replace(Character.toString('\240'), "");
            j1 = VerifySms.A() / 2;
            editable = ((Editable) (obj));
            int j = i;
            if (((String) (obj)).length() > 0)
            {
                editable = ((Editable) (obj));
                j = i;
                if (b.startsWith(((String) (obj))))
                {
                    editable = ((Editable) (obj));
                    j = i;
                    if (b.indexOf('-') >= 0)
                    {
                        editable = ((Editable) (obj));
                        j = i;
                        if (((String) (obj)).indexOf('-') < 0)
                        {
                            editable = ((String) (obj)).substring(0, ((String) (obj)).length() - 1);
                            j = i - 1;
                            obj = editable;
                            i = j;
                            if (i1 == 0)
                            {
                                break label0;
                            }
                        }
                    }
                }
            }
            obj = editable;
            i = j;
            if (editable.length() > j)
            {
                obj = editable;
                i = j;
                if (editable.indexOf('-') == j)
                {
                    obj = editable;
                    i = j;
                    if (j == j1 + 1)
                    {
                        i = j + 1;
                        obj = editable;
                    }
                }
            }
        }
        obj = ((String) (obj)).replace(Character.toString('-'), "");
        int l = ((String) (obj)).length();
        int k = l;
        editable = ((Editable) (obj));
        if (l > j1)
        {
            k = l + 1;
            editable = ((Editable) (obj));
        }
        do
        {
            obj = editable;
            if (editable.length() >= j1)
            {
                break;
            }
            obj = (new StringBuilder()).append(editable).append('\240').toString();
            editable = ((Editable) (obj));
        } while (i1 == 0);
        editable = (new StringBuilder()).append(((String) (obj)).substring(0, j1)).append('-').append(((String) (obj)).substring(j1, Math.min(VerifySms.A(), ((String) (obj)).length()))).toString();
        do
        {
            obj = editable;
            if (editable.length() >= VerifySms.A() + 1)
            {
                break;
            }
            obj = (new StringBuilder()).append(editable).append('\240').toString();
            editable = ((Editable) (obj));
        } while (i1 == 0);
        VerifySms.p(a).setText(((CharSequence) (obj)));
        k = Math.min(k, ((String) (obj)).length());
        VerifySms.p(a).setSelection(Math.min(i, k));
        VerifySms.p(a).addTextChangedListener(this);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (charsequence != null)
        {
            b = charsequence.toString();
        }
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
label0:
        {
            if (charsequence == null)
            {
                break label0;
            }
            charsequence = charsequence.toString().replace(Character.toString('\240'), "").replace(Character.toString('-'), "");
            if (charsequence.length() != VerifySms.A())
            {
                break label0;
            }
            if (VerifySms.b(a, charsequence))
            {
                asw.a(new abk(a), new String[] {
                    charsequence
                });
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (!a.isFinishing())
            {
                a.showDialog(33);
            }
        }
    }
}
