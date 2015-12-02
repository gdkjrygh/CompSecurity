// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.SparseIntArray;
import com.whatsapp.a1g;

// Referenced classes of package com.whatsapp.util:
//            ck, b3, ax, Log, 
//            ac, z, h

public class c
{

    private static final z a;
    private static final z b;
    private static boolean c;
    private static final z d;
    private static SparseIntArray e;
    private static boolean f;
    private static final String z[];

    private static int a(int i, int j)
    {
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
label4:
                        {
label5:
                            {
label6:
                                {
label7:
                                    {
label8:
                                        {
label9:
                                            {
label10:
                                                {
label11:
                                                    {
label12:
                                                        {
label13:
                                                            {
label14:
                                                                {
label15:
                                                                    {
label16:
                                                                        {
label17:
                                                                            {
label18:
                                                                                {
label19:
                                                                                    {
label20:
                                                                                        {
label21:
                                                                                            {
label22:
                                                                                                {
label23:
                                                                                                    {
label24:
                                                                                                        {
label25:
                                                                                                            {
label26:
                                                                                                                {
label27:
                                                                                                                    {
label28:
                                                                                                                        {
label29:
                                                                                                                            {
label30:
                                                                                                                                {
label31:
                                                                                                                                    {
label32:
                                                                                                                                        {
label33:
                                                                                                                                            {
label34:
                                                                                                                                                {
label35:
                                                                                                                                                    {
label36:
                                                                                                                                                        {
label37:
                                                                                                                                                            {
label38:
                                                                                                                                                                {
label39:
                                                                                                                                                                    {
label40:
                                                                                                                                                                        {
label41:
                                                                                                                                                                            {
label42:
                                                                                                                                                                                {
label43:
                                                                                                                                                                                    {
label44:
                                                                                                                                                                                        {
label45:
                                                                                                                                                                                            {
label46:
                                                                                                                                                                                                {
label47:
                                                                                                                                                                                                    {
label48:
                                                                                                                                                                                                        {
label49:
                                                                                                                                                                                                            {
label50:
                                                                                                                                                                                                                {
label51:
                                                                                                                                                                                                                    {
label52:
                                                                                                                                                                                                                        {
label53:
                                                                                                                                                                                                                            {
label54:
                                                                                                                                                                                                                                {
label55:
                                                                                                                                                                                                                                    {
label56:
                                                                                                                                                                                                                                        {
label57:
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                if (i >= 0x1f1e6 && i <= 0x1f1ff && j >= 0x1f1e6 && j <= 0x1f1ff)
                                                                                                                                                                                                                                                {
                                                                                                                                                                                                                                                    switch ((i - 0x1f1e6) + 65 << 8 | (j - 0x1f1e6) + 65)
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                    default:
                                                                                                                                                                                                                                                        if (!Log.f)
                                                                                                                                                                                                                                                        {
                                                                                                                                                                                                                                                            break label0;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        break;

                                                                                                                                                                                                                                                    case 16709: 
                                                                                                                                                                                                                                                        break label29;

                                                                                                                                                                                                                                                    case 16722: 
                                                                                                                                                                                                                                                        break label42;

                                                                                                                                                                                                                                                    case 16724: 
                                                                                                                                                                                                                                                        break label24;

                                                                                                                                                                                                                                                    case 16725: 
                                                                                                                                                                                                                                                        break label23;

                                                                                                                                                                                                                                                    case 16961: 
                                                                                                                                                                                                                                                        break label22;

                                                                                                                                                                                                                                                    case 16965: 
                                                                                                                                                                                                                                                        break label21;

                                                                                                                                                                                                                                                    case 16978: 
                                                                                                                                                                                                                                                        break label45;

                                                                                                                                                                                                                                                    case 17217: 
                                                                                                                                                                                                                                                        break label26;

                                                                                                                                                                                                                                                    case 17224: 
                                                                                                                                                                                                                                                        break label33;

                                                                                                                                                                                                                                                    case 17225: 
                                                                                                                                                                                                                                                        break label20;

                                                                                                                                                                                                                                                    case 17228: 
                                                                                                                                                                                                                                                        break label36;

                                                                                                                                                                                                                                                    case 17229: 
                                                                                                                                                                                                                                                        break label19;

                                                                                                                                                                                                                                                    case 17230: 
                                                                                                                                                                                                                                                        break label57;

                                                                                                                                                                                                                                                    case 17231: 
                                                                                                                                                                                                                                                        break label37;

                                                                                                                                                                                                                                                    case 17234: 
                                                                                                                                                                                                                                                        break label18;

                                                                                                                                                                                                                                                    case 17477: 
                                                                                                                                                                                                                                                        break label56;

                                                                                                                                                                                                                                                    case 17498: 
                                                                                                                                                                                                                                                        break label17;

                                                                                                                                                                                                                                                    case 17731: 
                                                                                                                                                                                                                                                        break label16;

                                                                                                                                                                                                                                                    case 17735: 
                                                                                                                                                                                                                                                        break label27;

                                                                                                                                                                                                                                                    case 17747: 
                                                                                                                                                                                                                                                        break label55;

                                                                                                                                                                                                                                                    case 18002: 
                                                                                                                                                                                                                                                        break label54;

                                                                                                                                                                                                                                                    case 18242: 
                                                                                                                                                                                                                                                        break label53;

                                                                                                                                                                                                                                                    case 18248: 
                                                                                                                                                                                                                                                        break label15;

                                                                                                                                                                                                                                                    case 18258: 
                                                                                                                                                                                                                                                        break label14;

                                                                                                                                                                                                                                                    case 18507: 
                                                                                                                                                                                                                                                        break label35;

                                                                                                                                                                                                                                                    case 18510: 
                                                                                                                                                                                                                                                        break label13;

                                                                                                                                                                                                                                                    case 18514: 
                                                                                                                                                                                                                                                        break label12;

                                                                                                                                                                                                                                                    case 18756: 
                                                                                                                                                                                                                                                        break label25;

                                                                                                                                                                                                                                                    case 18764: 
                                                                                                                                                                                                                                                        break label32;

                                                                                                                                                                                                                                                    case 18766: 
                                                                                                                                                                                                                                                        break label47;

                                                                                                                                                                                                                                                    case 18770: 
                                                                                                                                                                                                                                                        break label11;

                                                                                                                                                                                                                                                    case 18772: 
                                                                                                                                                                                                                                                        break label52;

                                                                                                                                                                                                                                                    case 19023: 
                                                                                                                                                                                                                                                        break label10;

                                                                                                                                                                                                                                                    case 19024: 
                                                                                                                                                                                                                                                        break label51;

                                                                                                                                                                                                                                                    case 19282: 
                                                                                                                                                                                                                                                        break label50;

                                                                                                                                                                                                                                                    case 19290: 
                                                                                                                                                                                                                                                        break label9;

                                                                                                                                                                                                                                                    case 19522: 
                                                                                                                                                                                                                                                        break label8;

                                                                                                                                                                                                                                                    case 19800: 
                                                                                                                                                                                                                                                        break label46;

                                                                                                                                                                                                                                                    case 19801: 
                                                                                                                                                                                                                                                        break label39;

                                                                                                                                                                                                                                                    case 20039: 
                                                                                                                                                                                                                                                        break label34;

                                                                                                                                                                                                                                                    case 20044: 
                                                                                                                                                                                                                                                        break label41;

                                                                                                                                                                                                                                                    case 20549: 
                                                                                                                                                                                                                                                        break label7;

                                                                                                                                                                                                                                                    case 20564: 
                                                                                                                                                                                                                                                        break label6;

                                                                                                                                                                                                                                                    case 21077: 
                                                                                                                                                                                                                                                        break label49;

                                                                                                                                                                                                                                                    case 21313: 
                                                                                                                                                                                                                                                        break label44;

                                                                                                                                                                                                                                                    case 21319: 
                                                                                                                                                                                                                                                        break label30;

                                                                                                                                                                                                                                                    case 21337: 
                                                                                                                                                                                                                                                        break label5;

                                                                                                                                                                                                                                                    case 21576: 
                                                                                                                                                                                                                                                        break label31;

                                                                                                                                                                                                                                                    case 21586: 
                                                                                                                                                                                                                                                        break label40;

                                                                                                                                                                                                                                                    case 21591: 
                                                                                                                                                                                                                                                        break label28;

                                                                                                                                                                                                                                                    case 21825: 
                                                                                                                                                                                                                                                        break label4;

                                                                                                                                                                                                                                                    case 21843: 
                                                                                                                                                                                                                                                        break label48;

                                                                                                                                                                                                                                                    case 21849: 
                                                                                                                                                                                                                                                        break label3;

                                                                                                                                                                                                                                                    case 22085: 
                                                                                                                                                                                                                                                        break label38;

                                                                                                                                                                                                                                                    case 22597: 
                                                                                                                                                                                                                                                        break label2;

                                                                                                                                                                                                                                                    case 23105: 
                                                                                                                                                                                                                                                        break label43;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (j != 8419)
                                                                                                                                                                                                                                                {
                                                                                                                                                                                                                                                    break label0;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (i == 35)
                                                                                                                                                                                                                                                {
                                                                                                                                                                                                                                                    return 57872;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                break label1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            return 58643;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        return 58638;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    return 58641;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                return 58637;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            return 58640;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        return 58639;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    return 58635;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                return 58644;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return 58642;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return 58636;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return 60417;
                                                                                                                                                                                                }
                                                                                                                                                                                                return 60418;
                                                                                                                                                                                            }
                                                                                                                                                                                            return 60419;
                                                                                                                                                                                        }
                                                                                                                                                                                        return 60420;
                                                                                                                                                                                    }
                                                                                                                                                                                    return 60421;
                                                                                                                                                                                }
                                                                                                                                                                                return 60422;
                                                                                                                                                                            }
                                                                                                                                                                            return 60423;
                                                                                                                                                                        }
                                                                                                                                                                        return 60424;
                                                                                                                                                                    }
                                                                                                                                                                    return 60425;
                                                                                                                                                                }
                                                                                                                                                                return 60426;
                                                                                                                                                            }
                                                                                                                                                            return 60427;
                                                                                                                                                        }
                                                                                                                                                        return 60428;
                                                                                                                                                    }
                                                                                                                                                    return 60429;
                                                                                                                                                }
                                                                                                                                                return 60430;
                                                                                                                                            }
                                                                                                                                            return 60431;
                                                                                                                                        }
                                                                                                                                        return 60432;
                                                                                                                                    }
                                                                                                                                    return 60433;
                                                                                                                                }
                                                                                                                                return 60434;
                                                                                                                            }
                                                                                                                            return 60435;
                                                                                                                        }
                                                                                                                        return 60436;
                                                                                                                    }
                                                                                                                    return 60437;
                                                                                                                }
                                                                                                                return 60438;
                                                                                                            }
                                                                                                            return 60439;
                                                                                                        }
                                                                                                        return 60440;
                                                                                                    }
                                                                                                    return 60441;
                                                                                                }
                                                                                                return 60442;
                                                                                            }
                                                                                            return 60443;
                                                                                        }
                                                                                        return 60444;
                                                                                    }
                                                                                    return 60445;
                                                                                }
                                                                                return 60446;
                                                                            }
                                                                            return 60447;
                                                                        }
                                                                        return 60448;
                                                                    }
                                                                    return 60449;
                                                                }
                                                                return 60450;
                                                            }
                                                            return 60451;
                                                        }
                                                        return 60452;
                                                    }
                                                    return 60453;
                                                }
                                                return 60454;
                                            }
                                            return 60455;
                                        }
                                        return 60456;
                                    }
                                    return 60457;
                                }
                                return 60458;
                            }
                            return 60459;
                        }
                        return 60460;
                    }
                    return 60461;
                }
                return 60462;
            }
            if (i == 49)
            {
                return 57884;
            }
            if (i == 50)
            {
                return 57885;
            }
            if (i == 51)
            {
                return 57886;
            }
            if (i == 52)
            {
                return 57887;
            }
            if (i == 53)
            {
                return 57888;
            }
            if (i == 54)
            {
                return 57889;
            }
            if (i == 55)
            {
                return 57890;
            }
            if (i == 56)
            {
                return 57891;
            }
            if (i == 57)
            {
                return 57892;
            }
            if (i == 48)
            {
                return 57893;
            }
        }
        return 0;
    }

    public static Drawable a(Context context, int i)
    {
        int j;
label0:
        {
            String s;
label1:
            {
                int k = e.get(i);
                j = k;
                if (k != 0)
                {
                    break label0;
                }
                if ((0xff000 & i) == 57344)
                {
                    s = Integer.toHexString(i);
                    if (!Log.f)
                    {
                        break label1;
                    }
                }
                s = (new StringBuilder()).append(z[57]).append(Integer.toHexString(i)).toString();
            }
            j = context.getResources().getIdentifier(s, z[56], z[59]);
            e.put(i, j);
        }
        try
        {
            context = context.getResources().getDrawable(j);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e((new StringBuilder()).append(z[58]).append(context.toString()).toString());
            return null;
        }
        return context;
    }

    public static SpannableStringBuilder a(String s, Context context)
    {
        return a(s, context, a);
    }

    public static SpannableStringBuilder a(String s, Context context, Paint paint)
    {
        return a(s, context, paint, 1.0F);
    }

    public static SpannableStringBuilder a(String s, Context context, Paint paint, float f1)
    {
        if (paint == null)
        {
            paint = b;
        } else
        {
            paint = new ac(paint, f1);
        }
        return a(s, context, ((z) (paint)));
    }

    private static SpannableStringBuilder a(String s, Context context, z z1)
    {
        boolean flag = Log.f;
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L13:
        return s;
_L2:
        Object obj;
        int j;
        int k;
        int l1;
        int i2;
        j = 0;
        k = 0;
        i2 = s.length();
        l1 = 0;
        obj = null;
_L15:
        if (l1 >= i2) goto _L4; else goto _L3
_L3:
        int i;
        int l;
        int i1;
        int j1;
        int j2;
        j2 = s.codePointAt(l1);
        j1 = Character.charCount(j2);
        i = 0;
        l = j1;
        i1 = i;
        if (!f(j2)) goto _L6; else goto _L5
_L5:
        l = j1;
        i1 = i;
        if (l1 + j1 >= i2) goto _L6; else goto _L7
_L7:
        int k2;
        k2 = s.codePointAt(l1 + j1);
        i = a(j2, k2);
        l = j1;
        if (i <= 0) goto _L9; else goto _L8
_L8:
        j1 += Character.charCount(k2);
        l = j1;
        i1 = i;
        if (!flag) goto _L6; else goto _L10
_L10:
        l = j1;
_L9:
        Object obj1;
        Object obj2;
        obj1 = b(j2, k2);
        int k1;
        if (obj1 != null)
        {
            i1 = l + Character.charCount(k2);
            obj2 = obj1;
            l = i;
            i = i1;
        } else
        {
            i1 = i;
            i = l;
            l = i1;
            obj2 = obj1;
        }
_L14:
label0:
        {
            i1 = l;
            if (l != 0)
            {
                break label0;
            }
            i1 = l;
            if (obj2 != null)
            {
                break label0;
            }
            if (c && (j2 & 0xfffff000) == 61440)
            {
                i1 = g(0x10000 | j2);
                if (!flag)
                {
                    break label0;
                }
            }
            i1 = g(j2);
        }
label1:
        {
label2:
            {
label3:
                {
label4:
                    {
                        if (!c(i1))
                        {
                            obj1 = obj;
                            k1 = k;
                            l = i;
                            if (obj2 == null)
                            {
                                break label1;
                            }
                        }
                        obj1 = obj;
                        if (obj == null)
                        {
                            obj1 = new SpannableStringBuilder(s);
                        }
                        if (obj2 == null)
                        {
                            obj = a(context, i1);
                        } else
                        {
                            obj = new h(((String) (obj2)));
                        }
                        if (obj == null)
                        {
                            break label3;
                        }
                        obj = new ImageSpan(z1.a(((Drawable) (obj)), context), 0);
                        if (l1 + i < i2)
                        {
                            l = s.codePointAt(l1 + i);
                            if (l >= 65024 && l <= 65039)
                            {
                                i++;
                            }
                        }
                        l = k;
                        if (c)
                        {
                            ((SpannableStringBuilder) (obj1)).replace(k, k + i, Character.toString((char)(0xffff & j2)), 0, 1);
                            ((SpannableStringBuilder) (obj1)).setSpan(obj, k, k + 1, 33);
                            l = k - (i - 1);
                            k = l;
                            if (!flag)
                            {
                                break label4;
                            }
                        }
                        ((SpannableStringBuilder) (obj1)).setSpan(obj, l, l + i, 33);
                        k = l;
                    }
                    if (!flag)
                    {
                        break label2;
                    }
                }
                return null;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_575;
            }
            l = i;
            k1 = k;
        }
        j = k1;
        obj = obj1;
        i = 1;
_L16:
        if (!flag) goto _L12; else goto _L11
_L11:
        s = ((String) (obj));
        if (obj != null)
        {
            s = ((String) (obj));
            if (i == 0)
            {
                ((SpannableStringBuilder) (obj)).append(" ");
                return ((SpannableStringBuilder) (obj));
            }
        }
          goto _L13
_L6:
        obj2 = null;
        i = l;
        l = i1;
          goto _L14
_L4:
        i = j;
          goto _L11
_L12:
        l1 = l + l1;
        k = j + l;
        j = i;
          goto _L15
        l = i;
        obj = obj1;
        i = j;
        j = k;
          goto _L16
    }

    public static String a(int i)
    {
        if (c)
        {
            return new String(Character.toChars(0xffff & i));
        } else
        {
            return new String(Character.toChars(i));
        }
    }

    public static String a(CharSequence charsequence)
    {
        StringBuilder stringbuilder;
        int k;
        int i1;
        boolean flag;
        flag = Log.f;
        stringbuilder = new StringBuilder();
        i1 = charsequence.length();
        k = 0;
_L8:
        if (k >= i1) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        int i;
        int j;
        int l;
        int j1;
        int k1;
        j1 = Character.codePointAt(charsequence, k);
        j = Character.charCount(j1);
        s1 = null;
        s = null;
        if (!f(j1) || k + j >= i1)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        k1 = Character.codePointAt(charsequence, k + j);
        l = a(j1, k1);
        i = j;
        if (l <= 0) goto _L4; else goto _L3
_L3:
        i = j + Character.charCount(k1);
        j = i;
        s = s1;
        if (!flag) goto _L5; else goto _L4
_L4:
        s1 = b(j1, k1);
        j = i;
        s = s1;
        if (s1 == null) goto _L5; else goto _L6
_L6:
        j = i + Character.charCount(k1);
        i = l;
        s = s1;
_L9:
label0:
        {
            l = i;
            if (i == 0)
            {
                l = i;
                if (s == null)
                {
                    l = g(j1);
                }
            }
            if (c(l) || s != null)
            {
                i = 0;
                do
                {
                    if (i >= j)
                    {
                        break;
                    }
                    stringbuilder.append(' ');
                    i++;
                } while (!flag);
                if (!flag)
                {
                    break label0;
                }
            }
            stringbuilder.append(Character.toChars(j1));
        }
        if (!flag) goto _L7; else goto _L2
_L2:
        return stringbuilder.toString();
_L7:
        k += j;
          goto _L8
_L5:
        i = l;
          goto _L9
        i = 0;
          goto _L9
    }

    public static String a(String s)
    {
        boolean flag = Log.f;
        if (!c)
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
label0:
        do
        {
label1:
            {
                char c1;
label2:
                {
label3:
                    {
                        if (i >= s.length())
                        {
                            break label0;
                        }
                        c1 = s.charAt(i);
                        if ((c1 & 0xfffff000) != 61440)
                        {
                            break label2;
                        }
                        int j = 0x10000 | c1;
                        if (c(g(j)) || f(j))
                        {
                            stringbuilder.append(Character.toChars(j));
                            if (!flag)
                            {
                                break label3;
                            }
                        }
                        stringbuilder.append(c1);
                    }
                    if (!flag)
                    {
                        break label1;
                    }
                }
                stringbuilder.append(c1);
            }
            i++;
        } while (!flag);
        return stringbuilder.toString();
    }

    public static void a(Editable editable, Context context)
    {
        String s;
        int k1;
        int i2;
        boolean flag;
label0:
        {
            flag = Log.f;
            if (f)
            {
                return;
            }
            f = true;
            s = editable.toString();
            ImageSpan aimagespan[] = (ImageSpan[])editable.getSpans(0, s.length(), android/text/style/ImageSpan);
            int i = 0;
            do
            {
                if (i >= aimagespan.length)
                {
                    break;
                }
                editable.removeSpan(aimagespan[i]);
                i++;
            } while (!flag);
            k1 = s.length();
            if (!c)
            {
                break label0;
            }
            int k = 0;
            i = 0;
label1:
            do
            {
                int i1;
                int l1;
label2:
                {
                    if (k >= k1)
                    {
                        break label1;
                    }
                    int j2 = s.codePointAt(k);
                    l1 = Character.charCount(j2);
                    i1 = i;
                    if (l1 <= 1)
                    {
                        break label2;
                    }
                    if (!f(j2))
                    {
                        i1 = i;
                        if (!c(g(j2)))
                        {
                            break label2;
                        }
                    }
                    editable.replace(i, i + l1, a(j2));
                    i1 = i - (l1 - 1);
                }
                k += l1;
                i = i1 + l1;
            } while (!flag);
            s = editable.toString();
            k1 = s.length();
        }
        i2 = 0;
_L7:
        if (i2 >= k1) goto _L2; else goto _L1
_L1:
        Object obj;
        int j;
        int l;
        int j1;
        int k2;
        int l2;
        int i3;
        j = s.codePointAt(i2);
        l2 = Character.charCount(j);
        obj = null;
        k2 = j;
        if (c)
        {
            k2 = j;
            if ((j & 0xfffff000) == 61440)
            {
                k2 = j | 0x10000;
            }
        }
        if (!f(k2) || i2 + l2 >= k1)
        {
            break MISSING_BLOCK_LABEL_603;
        }
        j = s.codePointAt(i2 + l2);
        i3 = Character.charCount(j);
        l = j;
        if (c)
        {
            l = j;
            if ((j & 0xfffff000) == 61440)
            {
                l = j | 0x10000;
            }
        }
        j = a(k2, l);
        j1 = l2;
        if (j <= 0) goto _L4; else goto _L3
_L3:
        j1 = l2 + i3;
        if (!flag) goto _L5; else goto _L4
_L4:
        obj = b(k2, l);
        if (obj != null)
        {
            j1 += i3;
            l = j;
            j = j1;
        } else
        {
            l = j;
            j = j1;
        }
_L8:
label3:
        {
            if (l == 0 && obj == null)
            {
                l = g(k2);
            }
            if (!c(l))
            {
                j1 = j;
                if (obj == null)
                {
                    break label3;
                }
            }
            if (obj == null)
            {
                obj = a(context, l);
            } else
            {
                obj = new h(((String) (obj)));
            }
            j1 = j;
            if (obj != null)
            {
                ((Drawable) (obj)).setBounds(0, 0, (int)a1g.a().a(((Drawable) (obj)).getIntrinsicWidth()), (int)a1g.a().a(((Drawable) (obj)).getIntrinsicWidth()));
                obj = new ImageSpan(((Drawable) (obj)), 0);
                if (i2 + j < k1)
                {
                    l = s.codePointAt(i2 + j);
                    if (l >= 65024 && l <= 65039)
                    {
                        j++;
                    }
                }
                editable.setSpan(obj, i2, i2 + j, 33);
                j1 = j;
            }
        }
        if (!flag) goto _L6; else goto _L2
_L2:
        f = false;
        return;
_L6:
        i2 += j1;
          goto _L7
_L5:
        l = j;
        j = j1;
          goto _L8
        l = 0;
        j = l2;
          goto _L8
    }

    public static int b(int i)
    {
        switch (i)
        {
        default:
            return i;

        case 57418: 
            return 9728;

        case 57417: 
            return 9729;

        case 57419: 
            return 9748;

        case 57416: 
            return 9924;

        case 57661: 
            return 9889;

        case 58435: 
            return 0x1f300;

        case 58428: 
            return 0x1f302;

        case 58443: 
            return 0x1f303;

        case 57421: 
            return 0x1f304;

        case 58441: 
            return 0x1f305;

        case 57670: 
            return 0x1f306;

        case 58442: 
            return 0x1f307;

        case 58444: 
            return 0x1f308;

        case 58430: 
            return 0x1f30a;

        case 57420: 
            return 0x1f319;

        case 58165: 
            return 0x1f31f;

        case 57380: 
            return 0x1f550;

        case 57381: 
            return 0x1f551;

        case 57382: 
            return 0x1f552;

        case 57383: 
            return 0x1f553;

        case 57384: 
            return 0x1f554;

        case 57385: 
            return 0x1f555;

        case 57386: 
            return 0x1f556;

        case 57387: 
            return 0x1f557;

        case 57388: 
            return 0x1f558;

        case 57389: 
            return 0x1f559;

        case 57390: 
            return 0x1f55a;

        case 57391: 
            return 0x1f55b;

        case 57919: 
            return 9800;

        case 57920: 
            return 9801;

        case 57921: 
            return 9802;

        case 57922: 
            return 9803;

        case 57923: 
            return 9804;

        case 57924: 
            return 9805;

        case 57925: 
            return 9806;

        case 57926: 
            return 9807;

        case 57927: 
            return 9808;

        case 57928: 
            return 9809;

        case 57929: 
            return 9810;

        case 57930: 
            return 9811;

        case 57931: 
            return 9934;

        case 57616: 
            return 0x1f340;

        case 58116: 
            return 0x1f337;

        case 57624: 
            return 0x1f341;

        case 57392: 
            return 0x1f338;

        case 57394: 
            return 0x1f339;

        case 57625: 
            return 0x1f342;

        case 58439: 
            return 0x1f343;

        case 58115: 
            return 0x1f33a;

        case 58117: 
            return 0x1f33b;

        case 58119: 
            return 0x1f334;

        case 58120: 
            return 0x1f335;

        case 58436: 
            return 0x1f33e;

        case 58181: 
            return 0x1f34e;

        case 58182: 
            return 0x1f34a;

        case 58183: 
            return 0x1f353;

        case 58184: 
            return 0x1f349;

        case 58185: 
            return 0x1f345;

        case 58186: 
            return 0x1f346;

        case 58393: 
            return 0x1f440;

        case 58395: 
            return 0x1f442;

        case 58394: 
            return 0x1f443;

        case 58396: 
            return 0x1f444;

        case 58140: 
            return 0x1f484;

        case 58141: 
            return 0x1f485;

        case 58142: 
            return 0x1f486;

        case 58143: 
            return 0x1f487;

        case 58144: 
            return 0x1f488;

        case 57345: 
            return 0x1f466;

        case 57346: 
            return 0x1f467;

        case 57348: 
            return 0x1f468;

        case 57349: 
            return 0x1f469;

        case 58408: 
            return 0x1f46b;

        case 57682: 
            return 0x1f46e;

        case 58409: 
            return 0x1f46f;

        case 58645: 
            return 0x1f471;

        case 58646: 
            return 0x1f472;

        case 58647: 
            return 0x1f473;

        case 58648: 
            return 0x1f474;

        case 58649: 
            return 0x1f475;

        case 58650: 
            return 0x1f476;

        case 58651: 
            return 0x1f477;

        case 58652: 
            return 0x1f478;

        case 57627: 
            return 0x1f47b;

        case 57422: 
            return 0x1f47c;

        case 57612: 
            return 0x1f47d;

        case 57643: 
            return 0x1f47e;

        case 57626: 
            return 0x1f47f;

        case 57628: 
            return 0x1f480;

        case 57939: 
            return 0x1f481;

        case 58654: 
            return 0x1f482;

        case 58655: 
            return 0x1f483;

        case 58669: 
            return 0x1f40d;

        case 57652: 
            return 0x1f40e;

        case 58670: 
            return 0x1f414;

        case 58671: 
            return 0x1f417;

        case 58672: 
            return 0x1f42b;

        case 58662: 
            return 0x1f418;

        case 58663: 
            return 0x1f428;

        case 58664: 
            return 0x1f412;

        case 58665: 
            return 0x1f411;

        case 57610: 
            return 0x1f419;

        case 58433: 
            return 0x1f41a;

        case 58661: 
            return 0x1f41b;

        case 58658: 
            return 0x1f420;

        case 58659: 
            return 0x1f424;

        case 58657: 
            return 0x1f426;

        case 57429: 
            return 0x1f427;

        case 57369: 
            return 0x1f41f;

        case 58656: 
            return 0x1f42c;

        case 57427: 
            return 0x1f42d;

        case 57424: 
            return 0x1f42f;

        case 57423: 
            return 0x1f431;

        case 57428: 
            return 0x1f433;

        case 57370: 
            return 0x1f434;

        case 57609: 
            return 0x1f435;

        case 57426: 
            return 0x1f436;

        case 57611: 
            return 0x1f437;

        case 57425: 
            return 0x1f43b;

        case 58660: 
            return 0x1f439;

        case 58666: 
            return 0x1f43a;

        case 58667: 
            return 0x1f42e;

        case 58668: 
            return 0x1f430;

        case 58673: 
            return 0x1f438;

        case 57433: 
            return 0x1f620;

        case 58384: 
            return 0x1f632;

        case 57432: 
            return 0x1f61e;

        case 58383: 
            return 0x1f630;

        case 58382: 
            return 0x1f612;

        case 57606: 
            return 0x1f60d;

        case 57605: 
            return 0x1f61c;

        case 58377: 
            return 0x1f61d;

        case 58392: 
            return 0x1f618;

        case 58391: 
            return 0x1f61a;

        case 58380: 
            return 0x1f637;

        case 58381: 
            return 0x1f633;

        case 57431: 
            return 0x1f603;

        case 58372: 
            return 0x1f601;

        case 58386: 
            return 0x1f602;

        case 57430: 
            return 0x1f60a;

        case 58388: 
            return 9786;

        case 58389: 
            return 0x1f604;

        case 58387: 
            return 0x1f622;

        case 58385: 
            return 0x1f62d;

        case 58379: 
            return 0x1f628;

        case 58374: 
            return 0x1f623;

        case 58390: 
            return 0x1f621;

        case 58378: 
            return 0x1f60c;

        case 58375: 
            return 0x1f616;

        case 58371: 
            return 0x1f614;

        case 57607: 
            return 0x1f631;

        case 58376: 
            return 0x1f62a;

        case 58370: 
            return 0x1f60f;

        case 57608: 
            return 0x1f613;

        case 58369: 
            return 0x1f625;

        case 58373: 
            return 0x1f609;

        case 58403: 
            return 0x1f645;

        case 58404: 
            return 0x1f646;

        case 58406: 
            return 0x1f647;

        case 58407: 
            return 0x1f64c;

        case 58397: 
            return 0x1f64f;

        case 57398: 
            return 0x1f3e0;

        case 57400: 
            return 0x1f3e2;

        case 57683: 
            return 0x1f3e3;

        case 57685: 
            return 0x1f3e5;

        case 57677: 
            return 0x1f3e6;

        case 57684: 
            return 0x1f3e7;

        case 57688: 
            return 0x1f3e8;

        case 58625: 
            return 0x1f3e9;

        case 57686: 
            return 0x1f3ea;

        case 57687: 
            return 0x1f3eb;

        case 57399: 
            return 9962;

        case 57633: 
            return 9970;

        case 58628: 
            return 0x1f3ec;

        case 58629: 
            return 0x1f3ef;

        case 58630: 
            return 0x1f3f0;

        case 58632: 
            return 0x1f3ed;

        case 57403: 
            return 0x1f5fb;

        case 58633: 
            return 0x1f5fc;

        case 58653: 
            return 0x1f5fd;

        case 57351: 
            return 0x1f45f;

        case 57662: 
            return 0x1f460;

        case 58138: 
            return 0x1f461;

        case 58139: 
            return 0x1f462;

        case 58678: 
            return 0x1f463;

        case 57350: 
            return 0x1f455;

        case 57614: 
            return 0x1f451;

        case 58114: 
            return 0x1f454;

        case 58136: 
            return 0x1f452;

        case 58137: 
            return 0x1f457;

        case 58145: 
            return 0x1f458;

        case 58146: 
            return 0x1f459;

        case 58147: 
            return 0x1f45c;

        case 57647: 
            return 0x1f4b0;

        case 57673: 
            return 0x1f4b1;

        case 57674: 
            return 0x1f4b9;

        case 57629: 
            return 0x1f525;

        case 57622: 
            return 0x1f528;

        case 57619: 
            return 0x1f52b;

        case 57918: 
            return 0x1f52f;

        case 57865: 
            return 0x1f530;

        case 57393: 
            return 0x1f531;

        case 57659: 
            return 0x1f489;

        case 58127: 
            return 0x1f48a;

        case 58674: 
            return 0x1f170;

        case 58675: 
            return 0x1f171;

        case 58676: 
            return 0x1f18e;

        case 58677: 
            return 0x1f17e;

        case 58132: 
            return 0x1f380;

        case 57618: 
            return 0x1f381;

        case 58187: 
            return 0x1f382;

        case 57395: 
            return 0x1f384;

        case 58440: 
            return 0x1f385;

        case 57667: 
            return 0x1f38c;

        case 57623: 
            return 0x1f386;

        case 58128: 
            return 0x1f388;

        case 58130: 
            return 0x1f389;

        case 58422: 
            return 0x1f38d;

        case 58424: 
            return 0x1f38e;

        case 58425: 
            return 0x1f393;

        case 58426: 
            return 0x1f392;

        case 58427: 
            return 0x1f38f;

        case 58432: 
            return 0x1f387;

        case 58434: 
            return 0x1f390;

        case 58437: 
            return 0x1f383;

        case 58438: 
            return 0x1f391;

        case 57353: 
            return 9742;

        case 57354: 
            return 0x1f4f1;

        case 57604: 
            return 0x1f4f2;

        case 58113: 
            return 0x1f4dd;

        case 57355: 
            return 0x1f4e0;

        case 57603: 
            return 0x1f4e9;

        case 57601: 
            return 0x1f4eb;

        case 57602: 
            return 0x1f4ee;

        case 57666: 
            return 0x1f4e2;

        case 58135: 
            return 0x1f4e3;

        case 57675: 
            return 0x1f4e1;

        case 57631: 
            return 0x1f4ba;

        case 57356: 
            return 0x1f4bb;

        case 57630: 
            return 0x1f4bc;

        case 58134: 
            return 0x1f4bd;

        case 57638: 
            return 0x1f4bf;

        case 57639: 
            return 0x1f4c0;

        case 58131: 
            return 9986;

        case 57672: 
            return 0x1f4d6;

        case 57366: 
            return 9918;

        case 57364: 
            return 9971;

        case 57365: 
            return 0x1f3be;

        case 57368: 
            return 9917;

        case 57363: 
            return 0x1f3bf;

        case 58410: 
            return 0x1f3c0;

        case 57650: 
            return 0x1f3c1;

        case 57621: 
            return 0x1f3c3;

        case 57367: 
            return 0x1f3c4;

        case 57649: 
            return 0x1f3c6;

        case 58411: 
            return 0x1f3c8;

        case 58413: 
            return 0x1f3ca;

        case 57374: 
            return 0x1f683;

        case 58420: 
            return 0x1f687;

        case 58421: 
            return 0x1f684;

        case 57375: 
            return 0x1f685;

        case 57371: 
            return 0x1f697;

        case 58414: 
            return 0x1f699;

        case 57689: 
            return 0x1f68c;

        case 57680: 
            return 0x1f68f;

        case 57858: 
            return 0x1f6a2;

        case 57373: 
            return 9992;

        case 57372: 
            return 9973;

        case 57401: 
            return 0x1f689;

        case 57613: 
            return 0x1f680;

        case 57653: 
            return 0x1f6a4;

        case 57690: 
            return 0x1f695;

        case 58415: 
            return 0x1f69a;

        case 58416: 
            return 0x1f692;

        case 58417: 
            return 0x1f691;

        case 58418: 
            return 0x1f693;

        case 57402: 
            return 9981;

        case 57679: 
            return 0x1f17f;

        case 57678: 
            return 0x1f6a5;

        case 57655: 
            return 0x1f6a7;

        case 57635: 
            return 9832;

        case 57634: 
            return 9978;

        case 57636: 
            return 0x1f3a1;

        case 58419: 
            return 0x1f3a2;

        case 57404: 
            return 0x1f3a4;

        case 57405: 
            return 0x1f3a5;

        case 58631: 
            return 0x1f3a6;

        case 58122: 
            return 0x1f3a7;

        case 58626: 
            return 0x1f3a8;

        case 58627: 
            return 0x1f3a9;

        case 57637: 
            return 0x1f3ab;

        case 58148: 
            return 0x1f3ac;

        case 57645: 
            return 0x1f004;

        case 57648: 
            return 0x1f3af;

        case 57651: 
            return 0x1f3b0;

        case 58412: 
            return 0x1f3b1;

        case 57406: 
            return 0x1f3b5;

        case 58150: 
            return 0x1f3b6;

        case 57408: 
            return 0x1f3b7;

        case 57409: 
            return 0x1f3b8;

        case 57410: 
            return 0x1f3ba;

        case 57644: 
            return 12349;

        case 57352: 
            return 0x1f4f7;

        case 57642: 
            return 0x1f4fa;

        case 57640: 
            return 0x1f4fb;

        case 57641: 
            return 0x1f4fc;

        case 57347: 
            return 0x1f48b;

        case 57396: 
            return 0x1f48d;

        case 57397: 
            return 0x1f48e;

        case 57617: 
            return 0x1f48f;

        case 58118: 
            return 0x1f490;

        case 58405: 
            return 0x1f491;

        case 58429: 
            return 0x1f492;

        case 57863: 
            return 0x1f51e;

        case 57934: 
            return 169;

        case 57935: 
            return 174;

        case 58679: 
            return 8482;

        case 57867: 
            return 0x1f4f6;

        case 57936: 
            return 0x1f4f3;

        case 57937: 
            return 0x1f4f4;

        case 57632: 
            return 0x1f354;

        case 58178: 
            return 0x1f359;

        case 57414: 
            return 0x1f370;

        case 58176: 
            return 0x1f35c;

        case 58169: 
            return 0x1f35e;

        case 57671: 
            return 0x1f373;

        case 58170: 
            return 0x1f366;

        case 58171: 
            return 0x1f35f;

        case 58172: 
            return 0x1f361;

        case 58173: 
            return 0x1f358;

        case 58174: 
            return 0x1f35a;

        case 58175: 
            return 0x1f35d;

        case 58177: 
            return 0x1f35b;

        case 58179: 
            return 0x1f362;

        case 58180: 
            return 0x1f363;

        case 58188: 
            return 0x1f371;

        case 58189: 
            return 0x1f372;

        case 58431: 
            return 0x1f367;

        case 57411: 
            return 0x1f374;

        case 57413: 
            return 9749;

        case 57412: 
            return 0x1f378;

        case 57415: 
            return 0x1f37a;

        case 58168: 
            return 0x1f375;

        case 58123: 
            return 0x1f376;

        case 58124: 
            return 0x1f37b;

        case 57910: 
            return 8599;

        case 57912: 
            return 8600;

        case 57911: 
            return 8598;

        case 57913: 
            return 8601;

        case 57906: 
            return 11014;

        case 57907: 
            return 11015;

        case 57908: 
            return 10145;

        case 57909: 
            return 11013;

        case 57914: 
            return 9654;

        case 57915: 
            return 9664;

        case 57916: 
            return 9193;

        case 57917: 
            return 9194;

        case 58162: 
            return 11093;

        case 58163: 
            return 10060;

        case 57377: 
            return 10071;

        case 57376: 
            return 10067;

        case 58166: 
            return 10068;

        case 58167: 
            return 10069;

        case 57873: 
            return 10175;

        case 57378: 
            return 10084;

        case 58151: 
            return 0x1f493;

        case 57379: 
            return 0x1f494;

        case 58152: 
            return 0x1f497;

        case 58153: 
            return 0x1f498;

        case 58154: 
            return 0x1f499;

        case 58155: 
            return 0x1f49a;

        case 58156: 
            return 0x1f49b;

        case 58157: 
            return 0x1f49c;

        case 58423: 
            return 0x1f49d;

        case 57860: 
            return 0x1f49f;

        case 57868: 
            return 9829;

        case 57870: 
            return 9824;

        case 57869: 
            return 9830;

        case 57871: 
            return 9827;

        case 58126: 
            return 0x1f6ac;

        case 57864: 
            return 0x1f6ad;

        case 57866: 
            return 9855;

        case 57938: 
            return 9888;

        case 57654: 
            return 0x1f6b2;

        case 57857: 
            return 0x1f6b6;

        case 57656: 
            return 0x1f6b9;

        case 57657: 
            return 0x1f6ba;

        case 57663: 
            return 0x1f6c0;

        case 57681: 
            return 0x1f6bb;

        case 57664: 
            return 0x1f6bd;

        case 58121: 
            return 0x1f6be;

        case 57658: 
            return 0x1f6bc;

        case 57876: 
            return 0x1f192;

        case 57897: 
            return 0x1f194;

        case 57874: 
            return 0x1f195;

        case 57933: 
            return 0x1f197;

        case 57875: 
            return 0x1f199;

        case 57646: 
            return 0x1f19a;

        case 57859: 
            return 0x1f201;

        case 57896: 
            return 0x1f202;

        case 57899: 
            return 0x1f233;

        case 57898: 
            return 0x1f235;

        case 57877: 
            return 0x1f236;

        case 57878: 
            return 0x1f21a;

        case 57879: 
            return 0x1f237;

        case 57880: 
            return 0x1f238;

        case 57895: 
            return 0x1f239;

        case 57900: 
            return 0x1f22f;

        case 57901: 
            return 0x1f23a;

        case 58133: 
            return 12953;

        case 58125: 
            return 12951;

        case 57894: 
            return 0x1f250;

        case 57615: 
            return 0x1f4a1;

        case 58164: 
            return 0x1f4a2;

        case 58129: 
            return 0x1f4a3;

        case 57660: 
            return 0x1f4a4;

        case 58161: 
            return 0x1f4a6;

        case 58160: 
            return 0x1f4a8;

        case 57434: 
            return 0x1f4a9;

        case 57676: 
            return 0x1f4aa;

        case 58158: 
            return 10024;

        case 57861: 
            return 10036;

        case 57862: 
            return 10035;

        case 57881: 
            return 0x1f534;

        case 57882: 
            return 0x1f532;

        case 57883: 
            return 0x1f533;

        case 58159: 
            return 11088;

        case 57665: 
            return 0x1f50a;

        case 57620: 
            return 0x1f50d;

        case 57668: 
            return 0x1f512;

        case 57669: 
            return 0x1f513;

        case 57407: 
            return 0x1f511;

        case 58149: 
            return 0x1f514;

        case 57932: 
            return 0x1f51d;

        case 57360: 
            return 9994;

        case 57362: 
            return 9995;

        case 57361: 
            return 9996;

        case 57357: 
            return 0x1f44a;

        case 57358: 
            return 0x1f44d;

        case 57359: 
            return 9757;

        case 57902: 
            return 0x1f446;

        case 57903: 
            return 0x1f447;

        case 57904: 
            return 0x1f448;

        case 57905: 
            return 0x1f449;

        case 58398: 
            return 0x1f44b;

        case 58399: 
            return 0x1f44f;

        case 58400: 
            return 0x1f44c;

        case 58401: 
            return 0x1f44e;

        case 58402: 
            return 0x1f450;
        }
    }

    public static CharSequence b(String s, Context context)
    {
        context = d(s, context);
        if (context == null)
        {
            return s;
        } else
        {
            return context;
        }
    }

    public static CharSequence b(String s, Context context, Paint paint)
    {
        context = a(s, context, paint);
        if (context == null)
        {
            return s;
        } else
        {
            return context;
        }
    }

    private static String b(int i, int j)
    {
        if (i >= 0x1f1e6 && i <= 0x1f1ff && j >= 0x1f1e6 && j <= 0x1f1ff)
        {
            return (new StringBuilder()).append(Character.toString((char)((i - 0x1f1e6) + 65))).append(Character.toString((char)((j - 0x1f1e6) + 65))).toString();
        } else
        {
            return null;
        }
    }

    public static String b(CharSequence charsequence)
    {
        boolean flag = Log.f;
        StringBuilder stringbuilder = new StringBuilder();
        int j = charsequence.length();
        int i = 0;
label0:
        do
        {
            int l;
label1:
            {
                int k;
label2:
                {
label3:
                    {
                        if (i >= j)
                        {
                            break label0;
                        }
                        k = Character.codePointAt(charsequence, i);
                        l = Character.charCount(k);
                        if (!c(k))
                        {
                            break label2;
                        }
                        if (android.os.Build.VERSION.SDK_INT < 16)
                        {
                            stringbuilder.append('\u25A1');
                            if (!flag)
                            {
                                break label1;
                            }
                        }
                        int i1 = b(k);
                        if (d(i1) || android.os.Build.VERSION.SDK_INT >= 19)
                        {
                            stringbuilder.append(Character.toChars(i1));
                            if (!flag)
                            {
                                break label3;
                            }
                        }
                        stringbuilder.append('\u25A1');
                    }
                    if (!flag)
                    {
                        break label1;
                    }
                }
                stringbuilder.append(Character.toChars(k));
            }
            i += l;
        } while (!flag);
        return stringbuilder.toString();
    }

    public static CharSequence c(String s, Context context)
    {
        context = a(s, context);
        if (context == null)
        {
            return s;
        } else
        {
            return context;
        }
    }

    public static boolean c(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 8252: 
        case 8265: 
        case 8505: 
        case 8596: 
        case 8597: 
        case 8617: 
        case 8618: 
        case 8986: 
        case 8987: 
        case 9195: 
        case 9196: 
        case 9200: 
        case 9203: 
        case 9410: 
        case 9642: 
        case 9643: 
        case 9723: 
        case 9724: 
        case 9725: 
        case 9726: 
        case 9745: 
        case 9851: 
        case 9875: 
        case 9898: 
        case 9899: 
        case 9925: 
        case 9940: 
        case 9989: 
        case 9993: 
        case 9999: 
        case 10002: 
        case 10004: 
        case 10006: 
        case 10052: 
        case 10055: 
        case 10062: 
        case 10133: 
        case 10134: 
        case 10135: 
        case 10160: 
        case 10548: 
        case 10549: 
        case 11035: 
        case 11036: 
        case 12336: 
        case 57345: 
        case 57346: 
        case 57347: 
        case 57348: 
        case 57349: 
        case 57350: 
        case 57351: 
        case 57352: 
        case 57353: 
        case 57354: 
        case 57355: 
        case 57356: 
        case 57357: 
        case 57358: 
        case 57359: 
        case 57360: 
        case 57361: 
        case 57362: 
        case 57363: 
        case 57364: 
        case 57365: 
        case 57366: 
        case 57367: 
        case 57368: 
        case 57369: 
        case 57370: 
        case 57371: 
        case 57372: 
        case 57373: 
        case 57374: 
        case 57375: 
        case 57376: 
        case 57377: 
        case 57378: 
        case 57379: 
        case 57380: 
        case 57381: 
        case 57382: 
        case 57383: 
        case 57384: 
        case 57385: 
        case 57386: 
        case 57387: 
        case 57388: 
        case 57389: 
        case 57390: 
        case 57391: 
        case 57392: 
        case 57393: 
        case 57394: 
        case 57395: 
        case 57396: 
        case 57397: 
        case 57398: 
        case 57399: 
        case 57400: 
        case 57401: 
        case 57402: 
        case 57403: 
        case 57404: 
        case 57405: 
        case 57406: 
        case 57407: 
        case 57408: 
        case 57409: 
        case 57410: 
        case 57411: 
        case 57412: 
        case 57413: 
        case 57414: 
        case 57415: 
        case 57416: 
        case 57417: 
        case 57418: 
        case 57419: 
        case 57420: 
        case 57421: 
        case 57422: 
        case 57423: 
        case 57424: 
        case 57425: 
        case 57426: 
        case 57427: 
        case 57428: 
        case 57429: 
        case 57430: 
        case 57431: 
        case 57432: 
        case 57433: 
        case 57434: 
        case 57601: 
        case 57602: 
        case 57603: 
        case 57604: 
        case 57605: 
        case 57606: 
        case 57607: 
        case 57608: 
        case 57609: 
        case 57610: 
        case 57611: 
        case 57612: 
        case 57613: 
        case 57614: 
        case 57615: 
        case 57616: 
        case 57617: 
        case 57618: 
        case 57619: 
        case 57620: 
        case 57621: 
        case 57622: 
        case 57623: 
        case 57624: 
        case 57625: 
        case 57626: 
        case 57627: 
        case 57628: 
        case 57629: 
        case 57630: 
        case 57631: 
        case 57632: 
        case 57633: 
        case 57634: 
        case 57635: 
        case 57636: 
        case 57637: 
        case 57638: 
        case 57639: 
        case 57640: 
        case 57641: 
        case 57642: 
        case 57643: 
        case 57644: 
        case 57645: 
        case 57646: 
        case 57647: 
        case 57648: 
        case 57649: 
        case 57650: 
        case 57651: 
        case 57652: 
        case 57653: 
        case 57654: 
        case 57655: 
        case 57656: 
        case 57657: 
        case 57658: 
        case 57659: 
        case 57660: 
        case 57661: 
        case 57662: 
        case 57663: 
        case 57664: 
        case 57665: 
        case 57666: 
        case 57667: 
        case 57668: 
        case 57669: 
        case 57670: 
        case 57671: 
        case 57672: 
        case 57673: 
        case 57674: 
        case 57675: 
        case 57676: 
        case 57677: 
        case 57678: 
        case 57679: 
        case 57680: 
        case 57681: 
        case 57682: 
        case 57683: 
        case 57684: 
        case 57685: 
        case 57686: 
        case 57687: 
        case 57688: 
        case 57689: 
        case 57690: 
        case 57857: 
        case 57858: 
        case 57859: 
        case 57860: 
        case 57861: 
        case 57862: 
        case 57863: 
        case 57864: 
        case 57865: 
        case 57866: 
        case 57867: 
        case 57868: 
        case 57869: 
        case 57870: 
        case 57871: 
        case 57872: 
        case 57873: 
        case 57874: 
        case 57875: 
        case 57876: 
        case 57877: 
        case 57878: 
        case 57879: 
        case 57880: 
        case 57881: 
        case 57882: 
        case 57883: 
        case 57884: 
        case 57885: 
        case 57886: 
        case 57887: 
        case 57888: 
        case 57889: 
        case 57890: 
        case 57891: 
        case 57892: 
        case 57893: 
        case 57894: 
        case 57895: 
        case 57896: 
        case 57897: 
        case 57898: 
        case 57899: 
        case 57900: 
        case 57901: 
        case 57902: 
        case 57903: 
        case 57904: 
        case 57905: 
        case 57906: 
        case 57907: 
        case 57908: 
        case 57909: 
        case 57910: 
        case 57911: 
        case 57912: 
        case 57913: 
        case 57914: 
        case 57915: 
        case 57916: 
        case 57917: 
        case 57918: 
        case 57919: 
        case 57920: 
        case 57921: 
        case 57922: 
        case 57923: 
        case 57924: 
        case 57925: 
        case 57926: 
        case 57927: 
        case 57928: 
        case 57929: 
        case 57930: 
        case 57931: 
        case 57932: 
        case 57933: 
        case 57934: 
        case 57935: 
        case 57936: 
        case 57937: 
        case 57938: 
        case 57939: 
        case 58113: 
        case 58114: 
        case 58115: 
        case 58116: 
        case 58117: 
        case 58118: 
        case 58119: 
        case 58120: 
        case 58121: 
        case 58122: 
        case 58123: 
        case 58124: 
        case 58125: 
        case 58126: 
        case 58127: 
        case 58128: 
        case 58129: 
        case 58130: 
        case 58131: 
        case 58132: 
        case 58133: 
        case 58134: 
        case 58135: 
        case 58136: 
        case 58137: 
        case 58138: 
        case 58139: 
        case 58140: 
        case 58141: 
        case 58142: 
        case 58143: 
        case 58144: 
        case 58145: 
        case 58146: 
        case 58147: 
        case 58148: 
        case 58149: 
        case 58150: 
        case 58151: 
        case 58152: 
        case 58153: 
        case 58154: 
        case 58155: 
        case 58156: 
        case 58157: 
        case 58158: 
        case 58159: 
        case 58160: 
        case 58161: 
        case 58162: 
        case 58163: 
        case 58164: 
        case 58165: 
        case 58166: 
        case 58167: 
        case 58168: 
        case 58169: 
        case 58170: 
        case 58171: 
        case 58172: 
        case 58173: 
        case 58174: 
        case 58175: 
        case 58176: 
        case 58177: 
        case 58178: 
        case 58179: 
        case 58180: 
        case 58181: 
        case 58182: 
        case 58183: 
        case 58184: 
        case 58185: 
        case 58186: 
        case 58187: 
        case 58188: 
        case 58189: 
        case 58369: 
        case 58370: 
        case 58371: 
        case 58372: 
        case 58373: 
        case 58374: 
        case 58375: 
        case 58376: 
        case 58377: 
        case 58378: 
        case 58379: 
        case 58380: 
        case 58381: 
        case 58382: 
        case 58383: 
        case 58384: 
        case 58385: 
        case 58386: 
        case 58387: 
        case 58388: 
        case 58389: 
        case 58390: 
        case 58391: 
        case 58392: 
        case 58393: 
        case 58394: 
        case 58395: 
        case 58396: 
        case 58397: 
        case 58398: 
        case 58399: 
        case 58400: 
        case 58401: 
        case 58402: 
        case 58403: 
        case 58404: 
        case 58405: 
        case 58406: 
        case 58407: 
        case 58408: 
        case 58409: 
        case 58410: 
        case 58411: 
        case 58412: 
        case 58413: 
        case 58414: 
        case 58415: 
        case 58416: 
        case 58417: 
        case 58418: 
        case 58419: 
        case 58420: 
        case 58421: 
        case 58422: 
        case 58423: 
        case 58424: 
        case 58425: 
        case 58426: 
        case 58427: 
        case 58428: 
        case 58429: 
        case 58430: 
        case 58431: 
        case 58432: 
        case 58433: 
        case 58434: 
        case 58435: 
        case 58436: 
        case 58437: 
        case 58438: 
        case 58439: 
        case 58440: 
        case 58441: 
        case 58442: 
        case 58443: 
        case 58444: 
        case 58625: 
        case 58626: 
        case 58627: 
        case 58628: 
        case 58629: 
        case 58630: 
        case 58631: 
        case 58632: 
        case 58633: 
        case 58634: 
        case 58635: 
        case 58636: 
        case 58637: 
        case 58638: 
        case 58639: 
        case 58640: 
        case 58641: 
        case 58642: 
        case 58643: 
        case 58644: 
        case 58645: 
        case 58646: 
        case 58647: 
        case 58648: 
        case 58649: 
        case 58650: 
        case 58651: 
        case 58652: 
        case 58653: 
        case 58654: 
        case 58655: 
        case 58656: 
        case 58657: 
        case 58658: 
        case 58659: 
        case 58660: 
        case 58661: 
        case 58662: 
        case 58663: 
        case 58664: 
        case 58665: 
        case 58666: 
        case 58667: 
        case 58668: 
        case 58669: 
        case 58670: 
        case 58671: 
        case 58672: 
        case 58673: 
        case 58674: 
        case 58675: 
        case 58676: 
        case 58677: 
        case 58678: 
        case 58679: 
        case 60417: 
        case 60418: 
        case 60419: 
        case 60420: 
        case 60421: 
        case 60422: 
        case 60423: 
        case 60424: 
        case 60425: 
        case 60426: 
        case 60427: 
        case 60428: 
        case 60429: 
        case 60430: 
        case 60431: 
        case 60432: 
        case 60433: 
        case 60434: 
        case 60435: 
        case 60436: 
        case 60437: 
        case 60438: 
        case 60439: 
        case 60440: 
        case 60441: 
        case 60442: 
        case 60443: 
        case 60444: 
        case 60445: 
        case 60446: 
        case 60447: 
        case 60448: 
        case 60449: 
        case 60450: 
        case 60451: 
        case 60452: 
        case 60453: 
        case 60454: 
        case 60455: 
        case 60456: 
        case 60457: 
        case 60458: 
        case 60459: 
        case 60460: 
        case 60461: 
        case 60462: 
        case 127183: 
        case 127377: 
        case 127379: 
        case 127382: 
        case 127384: 
        case 127538: 
        case 127540: 
        case 127569: 
        case 127745: 
        case 127753: 
        case 127755: 
        case 127756: 
        case 127757: 
        case 127758: 
        case 127759: 
        case 127760: 
        case 127761: 
        case 127762: 
        case 127763: 
        case 127764: 
        case 127765: 
        case 127766: 
        case 127767: 
        case 127768: 
        case 127770: 
        case 127771: 
        case 127772: 
        case 127773: 
        case 127774: 
        case 127776: 
        case 127792: 
        case 127793: 
        case 127794: 
        case 127795: 
        case 127804: 
        case 127805: 
        case 127807: 
        case 127812: 
        case 127815: 
        case 127816: 
        case 127819: 
        case 127820: 
        case 127821: 
        case 127823: 
        case 127824: 
        case 127825: 
        case 127826: 
        case 127829: 
        case 127830: 
        case 127831: 
        case 127840: 
        case 127844: 
        case 127845: 
        case 127848: 
        case 127849: 
        case 127850: 
        case 127851: 
        case 127852: 
        case 127853: 
        case 127854: 
        case 127855: 
        case 127863: 
        case 127865: 
        case 127868: 
        case 127882: 
        case 127883: 
        case 127904: 
        case 127907: 
        case 127914: 
        case 127917: 
        case 127918: 
        case 127922: 
        case 127923: 
        case 127924: 
        case 127929: 
        case 127931: 
        case 127932: 
        case 127933: 
        case 127938: 
        case 127943: 
        case 127945: 
        case 127969: 
        case 127972: 
        case 127982: 
        case 128000: 
        case 128001: 
        case 128002: 
        case 128003: 
        case 128004: 
        case 128005: 
        case 128006: 
        case 128007: 
        case 128008: 
        case 128009: 
        case 128010: 
        case 128011: 
        case 128012: 
        case 128015: 
        case 128016: 
        case 128019: 
        case 128021: 
        case 128022: 
        case 128028: 
        case 128029: 
        case 128030: 
        case 128033: 
        case 128034: 
        case 128035: 
        case 128037: 
        case 128041: 
        case 128042: 
        case 128050: 
        case 128060: 
        case 128061: 
        case 128062: 
        case 128069: 
        case 128083: 
        case 128086: 
        case 128090: 
        case 128091: 
        case 128093: 
        case 128094: 
        case 128100: 
        case 128101: 
        case 128106: 
        case 128108: 
        case 128109: 
        case 128112: 
        case 128121: 
        case 128122: 
        case 128140: 
        case 128149: 
        case 128150: 
        case 128158: 
        case 128160: 
        case 128165: 
        case 128167: 
        case 128171: 
        case 128172: 
        case 128173: 
        case 128174: 
        case 128175: 
        case 128178: 
        case 128179: 
        case 128180: 
        case 128181: 
        case 128182: 
        case 128183: 
        case 128184: 
        case 128190: 
        case 128193: 
        case 128194: 
        case 128195: 
        case 128196: 
        case 128197: 
        case 128198: 
        case 128199: 
        case 128200: 
        case 128201: 
        case 128202: 
        case 128203: 
        case 128204: 
        case 128205: 
        case 128206: 
        case 128207: 
        case 128208: 
        case 128209: 
        case 128210: 
        case 128211: 
        case 128212: 
        case 128213: 
        case 128215: 
        case 128216: 
        case 128217: 
        case 128218: 
        case 128219: 
        case 128220: 
        case 128222: 
        case 128223: 
        case 128228: 
        case 128229: 
        case 128230: 
        case 128231: 
        case 128232: 
        case 128234: 
        case 128236: 
        case 128237: 
        case 128239: 
        case 128240: 
        case 128245: 
        case 128249: 
        case 128256: 
        case 128257: 
        case 128258: 
        case 128259: 
        case 128260: 
        case 128261: 
        case 128262: 
        case 128263: 
        case 128264: 
        case 128265: 
        case 128267: 
        case 128268: 
        case 128270: 
        case 128271: 
        case 128272: 
        case 128277: 
        case 128278: 
        case 128279: 
        case 128280: 
        case 128281: 
        case 128282: 
        case 128283: 
        case 128284: 
        case 128287: 
        case 128288: 
        case 128289: 
        case 128290: 
        case 128291: 
        case 128292: 
        case 128294: 
        case 128295: 
        case 128297: 
        case 128298: 
        case 128300: 
        case 128301: 
        case 128302: 
        case 128309: 
        case 128310: 
        case 128311: 
        case 128312: 
        case 128313: 
        case 128314: 
        case 128315: 
        case 128316: 
        case 128317: 
        case 128348: 
        case 128349: 
        case 128350: 
        case 128351: 
        case 128352: 
        case 128353: 
        case 128354: 
        case 128355: 
        case 128356: 
        case 128357: 
        case 128358: 
        case 128359: 
        case 128510: 
        case 128511: 
        case 128512: 
        case 128517: 
        case 128518: 
        case 128519: 
        case 128520: 
        case 128523: 
        case 128526: 
        case 128528: 
        case 128529: 
        case 128533: 
        case 128535: 
        case 128537: 
        case 128539: 
        case 128543: 
        case 128548: 
        case 128550: 
        case 128551: 
        case 128553: 
        case 128555: 
        case 128556: 
        case 128558: 
        case 128559: 
        case 128564: 
        case 128565: 
        case 128566: 
        case 128568: 
        case 128569: 
        case 128570: 
        case 128571: 
        case 128572: 
        case 128573: 
        case 128574: 
        case 128575: 
        case 128576: 
        case 128584: 
        case 128585: 
        case 128586: 
        case 128587: 
        case 128589: 
        case 128590: 
        case 128641: 
        case 128642: 
        case 128646: 
        case 128648: 
        case 128650: 
        case 128651: 
        case 128653: 
        case 128654: 
        case 128656: 
        case 128660: 
        case 128662: 
        case 128664: 
        case 128667: 
        case 128668: 
        case 128669: 
        case 128670: 
        case 128671: 
        case 128672: 
        case 128673: 
        case 128675: 
        case 128678: 
        case 128680: 
        case 128681: 
        case 128682: 
        case 128683: 
        case 128686: 
        case 128687: 
        case 128688: 
        case 128689: 
        case 128691: 
        case 128692: 
        case 128693: 
        case 128695: 
        case 128696: 
        case 128703: 
        case 128705: 
        case 128706: 
        case 128707: 
        case 128708: 
        case 128709: 
            return true;
        }
    }

    public static SpannableStringBuilder d(String s, Context context)
    {
        return a(s, context, d);
    }

    private static boolean d(int i)
    {
        switch (i)
        {
        default:
            return true;

        case 9745: 
        case 9748: 
        case 9749: 
        case 9757: 
        case 57872: 
        case 57884: 
        case 57885: 
        case 57886: 
        case 57887: 
        case 57888: 
        case 57889: 
        case 57890: 
        case 57891: 
        case 57892: 
        case 57893: 
        case 58634: 
        case 58635: 
        case 58636: 
        case 58637: 
        case 58638: 
        case 58639: 
        case 58640: 
        case 58641: 
        case 58642: 
        case 58643: 
        case 58644: 
        case 60417: 
        case 60418: 
        case 60419: 
        case 60420: 
        case 60421: 
        case 60422: 
        case 60423: 
        case 60424: 
        case 60425: 
        case 60426: 
        case 60427: 
        case 60428: 
        case 60429: 
        case 60430: 
        case 60431: 
        case 60432: 
        case 60433: 
        case 60434: 
        case 60435: 
        case 60436: 
        case 60437: 
        case 60438: 
        case 60439: 
        case 127757: 
        case 127758: 
        case 127760: 
        case 127762: 
        case 127766: 
        case 127767: 
        case 127768: 
        case 127770: 
        case 127772: 
        case 127773: 
        case 127774: 
        case 127794: 
        case 127795: 
        case 127819: 
        case 127824: 
        case 127868: 
        case 127943: 
        case 127945: 
        case 127972: 
        case 128000: 
        case 128001: 
        case 128002: 
        case 128003: 
        case 128004: 
        case 128005: 
        case 128006: 
        case 128007: 
        case 128008: 
        case 128009: 
        case 128010: 
        case 128011: 
        case 128015: 
        case 128016: 
        case 128019: 
        case 128021: 
        case 128022: 
        case 128042: 
        case 128101: 
        case 128108: 
        case 128109: 
        case 128113: 
        case 128114: 
        case 128115: 
        case 128173: 
        case 128182: 
        case 128183: 
        case 128236: 
        case 128237: 
        case 128239: 
        case 128245: 
        case 128256: 
        case 128257: 
        case 128258: 
        case 128260: 
        case 128261: 
        case 128262: 
        case 128263: 
        case 128264: 
        case 128265: 
        case 128277: 
        case 128300: 
        case 128301: 
        case 128348: 
        case 128349: 
        case 128350: 
        case 128351: 
        case 128353: 
        case 128354: 
        case 128355: 
        case 128356: 
        case 128357: 
        case 128358: 
        case 128359: 
        case 128512: 
        case 128519: 
        case 128520: 
        case 128526: 
        case 128528: 
        case 128529: 
        case 128533: 
        case 128535: 
        case 128537: 
        case 128539: 
        case 128543: 
        case 128550: 
        case 128551: 
        case 128556: 
        case 128558: 
        case 128559: 
        case 128564: 
        case 128566: 
        case 128641: 
        case 128642: 
        case 128646: 
        case 128648: 
        case 128650: 
        case 128651: 
        case 128653: 
        case 128654: 
        case 128656: 
        case 128660: 
        case 128662: 
        case 128664: 
        case 128667: 
        case 128668: 
        case 128669: 
        case 128670: 
        case 128671: 
        case 128672: 
        case 128673: 
        case 128675: 
        case 128678: 
        case 128686: 
        case 128687: 
        case 128688: 
        case 128689: 
        case 128691: 
        case 128692: 
        case 128693: 
        case 128695: 
        case 128696: 
        case 128703: 
        case 128705: 
        case 128706: 
        case 128707: 
        case 128708: 
        case 128709: 
            return false;
        }
    }

    public static int[] e(int i)
    {
        int ai[] = null;
        if (i < 60417 || i > 60462) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR lookupswitch 56: default 476
    //                   58635: 575
    //                   58636: 605
    //                   58637: 546
    //                   58638: 526
    //                   58639: 565
    //                   58640: 555
    //                   58641: 536
    //                   58642: 595
    //                   58643: 516
    //                   58644: 585
    //                   60417: 615
    //                   60418: 625
    //                   60419: 635
    //                   60420: 645
    //                   60421: 655
    //                   60422: 665
    //                   60423: 675
    //                   60424: 685
    //                   60425: 695
    //                   60426: 704
    //                   60427: 714
    //                   60428: 724
    //                   60429: 734
    //                   60430: 744
    //                   60431: 754
    //                   60432: 764
    //                   60433: 774
    //                   60434: 784
    //                   60435: 793
    //                   60436: 803
    //                   60437: 812
    //                   60438: 822
    //                   60439: 832
    //                   60440: 842
    //                   60441: 852
    //                   60442: 862
    //                   60443: 872
    //                   60444: 882
    //                   60445: 892
    //                   60446: 902
    //                   60447: 912
    //                   60448: 922
    //                   60449: 932
    //                   60450: 941
    //                   60451: 951
    //                   60452: 961
    //                   60453: 971
    //                   60454: 981
    //                   60455: 991
    //                   60456: 1001
    //                   60457: 1011
    //                   60458: 1020
    //                   60459: 1030
    //                   60460: 1040
    //                   60461: 1050
    //                   60462: 1060;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59
_L3:
        String s = null;
_L60:
        if (s != null)
        {
            ai = new int[2];
            ai[0] = (s.charAt(0) + 0x1f1e6) - 65;
            ai[1] = (s.charAt(1) + 0x1f1e6) - 65;
        }
        return ai;
_L12:
        s = z[27];
        continue; /* Loop/switch isn't completed */
_L7:
        s = z[44];
        continue; /* Loop/switch isn't completed */
_L10:
        s = z[47];
        continue; /* Loop/switch isn't completed */
_L6:
        s = z[3];
        continue; /* Loop/switch isn't completed */
_L9:
        s = z[36];
        continue; /* Loop/switch isn't completed */
_L8:
        s = z[35];
        continue; /* Loop/switch isn't completed */
_L4:
        s = z[32];
        continue; /* Loop/switch isn't completed */
_L13:
        s = z[40];
        continue; /* Loop/switch isn't completed */
_L11:
        s = z[51];
        continue; /* Loop/switch isn't completed */
_L5:
        s = z[18];
        continue; /* Loop/switch isn't completed */
_L14:
        s = z[42];
        continue; /* Loop/switch isn't completed */
_L15:
        s = z[53];
        continue; /* Loop/switch isn't completed */
_L16:
        s = z[7];
        continue; /* Loop/switch isn't completed */
_L17:
        s = z[10];
        continue; /* Loop/switch isn't completed */
_L18:
        s = z[54];
        continue; /* Loop/switch isn't completed */
_L19:
        s = z[49];
        continue; /* Loop/switch isn't completed */
_L20:
        s = z[14];
        continue; /* Loop/switch isn't completed */
_L21:
        s = z[55];
        continue; /* Loop/switch isn't completed */
_L22:
        s = z[2];
        continue; /* Loop/switch isn't completed */
_L23:
        s = z[46];
        continue; /* Loop/switch isn't completed */
_L24:
        s = z[34];
        continue; /* Loop/switch isn't completed */
_L25:
        s = z[50];
        continue; /* Loop/switch isn't completed */
_L26:
        s = z[30];
        continue; /* Loop/switch isn't completed */
_L27:
        s = z[17];
        continue; /* Loop/switch isn't completed */
_L28:
        s = z[25];
        continue; /* Loop/switch isn't completed */
_L29:
        s = z[22];
        continue; /* Loop/switch isn't completed */
_L30:
        s = z[11];
        continue; /* Loop/switch isn't completed */
_L31:
        s = z[1];
        continue; /* Loop/switch isn't completed */
_L32:
        s = z[43];
        continue; /* Loop/switch isn't completed */
_L33:
        s = z[5];
        continue; /* Loop/switch isn't completed */
_L34:
        s = z[19];
        continue; /* Loop/switch isn't completed */
_L35:
        s = z[28];
        continue; /* Loop/switch isn't completed */
_L36:
        s = z[52];
        continue; /* Loop/switch isn't completed */
_L37:
        s = z[24];
        continue; /* Loop/switch isn't completed */
_L38:
        s = z[33];
        continue; /* Loop/switch isn't completed */
_L39:
        s = z[8];
        continue; /* Loop/switch isn't completed */
_L40:
        s = z[38];
        continue; /* Loop/switch isn't completed */
_L41:
        s = z[15];
        continue; /* Loop/switch isn't completed */
_L42:
        s = z[20];
        continue; /* Loop/switch isn't completed */
_L43:
        s = z[45];
        continue; /* Loop/switch isn't completed */
_L44:
        s = z[12];
        continue; /* Loop/switch isn't completed */
_L45:
        s = z[21];
        continue; /* Loop/switch isn't completed */
_L46:
        s = z[0];
        continue; /* Loop/switch isn't completed */
_L47:
        s = z[9];
        continue; /* Loop/switch isn't completed */
_L48:
        s = z[48];
        continue; /* Loop/switch isn't completed */
_L49:
        s = z[23];
        continue; /* Loop/switch isn't completed */
_L50:
        s = z[37];
        continue; /* Loop/switch isn't completed */
_L51:
        s = z[16];
        continue; /* Loop/switch isn't completed */
_L52:
        s = z[26];
        continue; /* Loop/switch isn't completed */
_L53:
        s = z[6];
        continue; /* Loop/switch isn't completed */
_L54:
        s = z[4];
        continue; /* Loop/switch isn't completed */
_L55:
        s = z[39];
        continue; /* Loop/switch isn't completed */
_L56:
        s = z[31];
        continue; /* Loop/switch isn't completed */
_L57:
        s = z[13];
        continue; /* Loop/switch isn't completed */
_L58:
        s = z[41];
        continue; /* Loop/switch isn't completed */
_L59:
        s = z[29];
        if (true) goto _L60; else goto _L2
_L2:
        switch (i)
        {
        case 57873: 
        case 57874: 
        case 57875: 
        case 57876: 
        case 57877: 
        case 57878: 
        case 57879: 
        case 57880: 
        case 57881: 
        case 57882: 
        case 57883: 
        default:
            return null;

        case 57872: 
            return (new int[] {
                35, 8419
            });

        case 57884: 
            return (new int[] {
                49, 8419
            });

        case 57885: 
            return (new int[] {
                50, 8419
            });

        case 57886: 
            return (new int[] {
                51, 8419
            });

        case 57887: 
            return (new int[] {
                52, 8419
            });

        case 57888: 
            return (new int[] {
                53, 8419
            });

        case 57889: 
            return (new int[] {
                54, 8419
            });

        case 57890: 
            return (new int[] {
                55, 8419
            });

        case 57891: 
            return (new int[] {
                56, 8419
            });

        case 57892: 
            return (new int[] {
                57, 8419
            });

        case 57893: 
            return (new int[] {
                48, 8419
            });
        }
    }

    private static boolean f(int i)
    {
        if (i < 0x1f1e6 || i > 0x1f1ff) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        switch (i)
        {
        case 36: // '$'
        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 40: // '('
        case 41: // ')'
        case 42: // '*'
        case 43: // '+'
        case 44: // ','
        case 45: // '-'
        case 46: // '.'
        case 47: // '/'
        default:
            return false;

        case 35: // '#'
        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 54: // '6'
        case 55: // '7'
        case 56: // '8'
        case 57: // '9'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static int g(int i)
    {
        switch (i)
        {
        default:
            return i;

        case 9728: 
            return 57418;

        case 9729: 
            return 57417;

        case 9748: 
            return 57419;

        case 9924: 
            return 57416;

        case 9889: 
            return 57661;

        case 127744: 
            return 58435;

        case 127746: 
            return 58428;

        case 127747: 
            return 58443;

        case 127748: 
            return 57421;

        case 127749: 
            return 58441;

        case 127750: 
            return 57670;

        case 127751: 
            return 58442;

        case 127752: 
            return 58444;

        case 127754: 
            return 58430;

        case 127769: 
            return 57420;

        case 127775: 
            return 58165;

        case 128336: 
            return 57380;

        case 128337: 
            return 57381;

        case 128338: 
            return 57382;

        case 128339: 
            return 57383;

        case 128340: 
            return 57384;

        case 128341: 
            return 57385;

        case 128342: 
            return 57386;

        case 128343: 
            return 57387;

        case 128344: 
            return 57388;

        case 128345: 
            return 57389;

        case 128346: 
            return 57390;

        case 128347: 
            return 57391;

        case 9800: 
            return 57919;

        case 9801: 
            return 57920;

        case 9802: 
            return 57921;

        case 9803: 
            return 57922;

        case 9804: 
            return 57923;

        case 9805: 
            return 57924;

        case 9806: 
            return 57925;

        case 9807: 
            return 57926;

        case 9808: 
            return 57927;

        case 9809: 
            return 57928;

        case 9810: 
            return 57929;

        case 9811: 
            return 57930;

        case 9934: 
            return 57931;

        case 127808: 
            return 57616;

        case 127799: 
            return 58116;

        case 127809: 
            return 57624;

        case 127800: 
            return 57392;

        case 127801: 
            return 57394;

        case 127810: 
            return 57625;

        case 127811: 
            return 58439;

        case 127802: 
            return 58115;

        case 127803: 
            return 58117;

        case 127796: 
            return 58119;

        case 127797: 
            return 58120;

        case 127806: 
            return 58436;

        case 127822: 
            return 58181;

        case 127818: 
            return 58182;

        case 127827: 
            return 58183;

        case 127817: 
            return 58184;

        case 127813: 
            return 58185;

        case 127814: 
            return 58186;

        case 128064: 
            return 58393;

        case 128066: 
            return 58395;

        case 128067: 
            return 58394;

        case 128068: 
            return 58396;

        case 128132: 
            return 58140;

        case 128133: 
            return 58141;

        case 128134: 
            return 58142;

        case 128135: 
            return 58143;

        case 128136: 
            return 58144;

        case 128102: 
            return 57345;

        case 128103: 
            return 57346;

        case 128104: 
            return 57348;

        case 128105: 
            return 57349;

        case 128107: 
            return 58408;

        case 128110: 
            return 57682;

        case 128111: 
            return 58409;

        case 128113: 
            return 58645;

        case 128114: 
            return 58646;

        case 128115: 
            return 58647;

        case 128116: 
            return 58648;

        case 128117: 
            return 58649;

        case 128118: 
            return 58650;

        case 128119: 
            return 58651;

        case 128120: 
            return 58652;

        case 128123: 
            return 57627;

        case 128124: 
            return 57422;

        case 128125: 
            return 57612;

        case 128126: 
            return 57643;

        case 128127: 
            return 57626;

        case 128128: 
            return 57628;

        case 128129: 
            return 57939;

        case 128130: 
            return 58654;

        case 128131: 
            return 58655;

        case 128013: 
            return 58669;

        case 128014: 
            return 57652;

        case 128020: 
            return 58670;

        case 128023: 
            return 58671;

        case 128043: 
            return 58672;

        case 128024: 
            return 58662;

        case 128040: 
            return 58663;

        case 128018: 
            return 58664;

        case 128017: 
            return 58665;

        case 128025: 
            return 57610;

        case 128026: 
            return 58433;

        case 128027: 
            return 58661;

        case 128032: 
            return 58658;

        case 128036: 
            return 58659;

        case 128038: 
            return 58657;

        case 128039: 
            return 57429;

        case 128031: 
            return 57369;

        case 128044: 
            return 58656;

        case 128045: 
            return 57427;

        case 128047: 
            return 57424;

        case 128049: 
            return 57423;

        case 128051: 
            return 57428;

        case 128052: 
            return 57370;

        case 128053: 
            return 57609;

        case 128054: 
            return 57426;

        case 128055: 
            return 57611;

        case 128059: 
            return 57425;

        case 128057: 
            return 58660;

        case 128058: 
            return 58666;

        case 128046: 
            return 58667;

        case 128048: 
            return 58668;

        case 128056: 
            return 58673;

        case 128544: 
            return 57433;

        case 128562: 
            return 58384;

        case 128542: 
            return 57432;

        case 128560: 
            return 58383;

        case 128530: 
            return 58382;

        case 128525: 
            return 57606;

        case 128540: 
            return 57605;

        case 128541: 
            return 58377;

        case 128536: 
            return 58392;

        case 128538: 
            return 58391;

        case 128567: 
            return 58380;

        case 128563: 
            return 58381;

        case 128515: 
            return 57431;

        case 128513: 
            return 58372;

        case 128514: 
            return 58386;

        case 128522: 
            return 57430;

        case 9786: 
            return 58388;

        case 128516: 
            return 58389;

        case 128546: 
            return 58387;

        case 128557: 
            return 58385;

        case 128552: 
            return 58379;

        case 128547: 
            return 58374;

        case 128545: 
            return 58390;

        case 128524: 
            return 58378;

        case 128534: 
            return 58375;

        case 128532: 
            return 58371;

        case 128561: 
            return 57607;

        case 128554: 
            return 58376;

        case 128527: 
            return 58370;

        case 128531: 
            return 57608;

        case 128549: 
            return 58369;

        case 128521: 
            return 58373;

        case 128581: 
            return 58403;

        case 128582: 
            return 58404;

        case 128583: 
            return 58406;

        case 128588: 
            return 58407;

        case 128591: 
            return 58397;

        case 127968: 
            return 57398;

        case 127970: 
            return 57400;

        case 127971: 
            return 57683;

        case 127973: 
            return 57685;

        case 127974: 
            return 57677;

        case 127975: 
            return 57684;

        case 127976: 
            return 57688;

        case 127977: 
            return 58625;

        case 127978: 
            return 57686;

        case 127979: 
            return 57687;

        case 9962: 
            return 57399;

        case 9970: 
            return 57633;

        case 127980: 
            return 58628;

        case 127983: 
            return 58629;

        case 127984: 
            return 58630;

        case 127981: 
            return 58632;

        case 128507: 
            return 57403;

        case 128508: 
            return 58633;

        case 128509: 
            return 58653;

        case 128095: 
            return 57351;

        case 128096: 
            return 57662;

        case 128097: 
            return 58138;

        case 128098: 
            return 58139;

        case 128099: 
            return 58678;

        case 128085: 
            return 57350;

        case 128081: 
            return 57614;

        case 128084: 
            return 58114;

        case 128082: 
            return 58136;

        case 128087: 
            return 58137;

        case 128088: 
            return 58145;

        case 128089: 
            return 58146;

        case 128092: 
            return 58147;

        case 128176: 
            return 57647;

        case 128177: 
            return 57673;

        case 128185: 
            return 57674;

        case 128293: 
            return 57629;

        case 128296: 
            return 57622;

        case 128299: 
            return 57619;

        case 128303: 
            return 57918;

        case 128304: 
            return 57865;

        case 128305: 
            return 57393;

        case 128137: 
            return 57659;

        case 128138: 
            return 58127;

        case 127344: 
            return 58674;

        case 127345: 
            return 58675;

        case 127374: 
            return 58676;

        case 127358: 
            return 58677;

        case 127872: 
            return 58132;

        case 127873: 
            return 57618;

        case 127874: 
            return 58187;

        case 127876: 
            return 57395;

        case 127877: 
            return 58440;

        case 127884: 
            return 57667;

        case 127878: 
            return 57623;

        case 127880: 
            return 58128;

        case 127881: 
            return 58130;

        case 127885: 
            return 58422;

        case 127886: 
            return 58424;

        case 127891: 
            return 58425;

        case 127890: 
            return 58426;

        case 127887: 
            return 58427;

        case 127879: 
            return 58432;

        case 127888: 
            return 58434;

        case 127875: 
            return 58437;

        case 127889: 
            return 58438;

        case 9742: 
            return 57353;

        case 128241: 
            return 57354;

        case 128242: 
            return 57604;

        case 128221: 
            return 58113;

        case 128224: 
            return 57355;

        case 128233: 
            return 57603;

        case 128235: 
            return 57601;

        case 128238: 
            return 57602;

        case 128226: 
            return 57666;

        case 128227: 
            return 58135;

        case 128225: 
            return 57675;

        case 128186: 
            return 57631;

        case 128187: 
            return 57356;

        case 128188: 
            return 57630;

        case 128189: 
            return 58134;

        case 128191: 
            return 57638;

        case 128192: 
            return 57639;

        case 9986: 
            return 58131;

        case 128214: 
            return 57672;

        case 9918: 
            return 57366;

        case 9971: 
            return 57364;

        case 127934: 
            return 57365;

        case 9917: 
            return 57368;

        case 127935: 
            return 57363;

        case 127936: 
            return 58410;

        case 127937: 
            return 57650;

        case 127939: 
            return 57621;

        case 127940: 
            return 57367;

        case 127942: 
            return 57649;

        case 127944: 
            return 58411;

        case 127946: 
            return 58413;

        case 128643: 
            return 57374;

        case 128647: 
            return 58420;

        case 128644: 
            return 58421;

        case 128645: 
            return 57375;

        case 128663: 
            return 57371;

        case 128665: 
            return 58414;

        case 128652: 
            return 57689;

        case 128655: 
            return 57680;

        case 128674: 
            return 57858;

        case 9992: 
            return 57373;

        case 9973: 
            return 57372;

        case 128649: 
            return 57401;

        case 128640: 
            return 57613;

        case 128676: 
            return 57653;

        case 128661: 
            return 57690;

        case 128666: 
            return 58415;

        case 128658: 
            return 58416;

        case 128657: 
            return 58417;

        case 128659: 
            return 58418;

        case 9981: 
            return 57402;

        case 127359: 
            return 57679;

        case 128677: 
            return 57678;

        case 128679: 
            return 57655;

        case 9832: 
            return 57635;

        case 9978: 
            return 57634;

        case 127905: 
            return 57636;

        case 127906: 
            return 58419;

        case 127908: 
            return 57404;

        case 127909: 
            return 57405;

        case 127910: 
            return 58631;

        case 127911: 
            return 58122;

        case 127912: 
            return 58626;

        case 127913: 
            return 58627;

        case 127915: 
            return 57637;

        case 127916: 
            return 58148;

        case 126980: 
            return 57645;

        case 127919: 
            return 57648;

        case 127920: 
            return 57651;

        case 127921: 
            return 58412;

        case 127925: 
            return 57406;

        case 127926: 
            return 58150;

        case 127927: 
            return 57408;

        case 127928: 
            return 57409;

        case 127930: 
            return 57410;

        case 12349: 
            return 57644;

        case 128247: 
            return 57352;

        case 128250: 
            return 57642;

        case 128251: 
            return 57640;

        case 128252: 
            return 57641;

        case 128139: 
            return 57347;

        case 128141: 
            return 57396;

        case 128142: 
            return 57397;

        case 128143: 
            return 57617;

        case 128144: 
            return 58118;

        case 128145: 
            return 58405;

        case 128146: 
            return 58429;

        case 128286: 
            return 57863;

        case 169: 
            return 57934;

        case 174: 
            return 57935;

        case 8482: 
            return 58679;

        case 128246: 
            return 57867;

        case 128243: 
            return 57936;

        case 128244: 
            return 57937;

        case 127828: 
            return 57632;

        case 127833: 
            return 58178;

        case 127856: 
            return 57414;

        case 127836: 
            return 58176;

        case 127838: 
            return 58169;

        case 127859: 
            return 57671;

        case 127846: 
            return 58170;

        case 127839: 
            return 58171;

        case 127841: 
            return 58172;

        case 127832: 
            return 58173;

        case 127834: 
            return 58174;

        case 127837: 
            return 58175;

        case 127835: 
            return 58177;

        case 127842: 
            return 58179;

        case 127843: 
            return 58180;

        case 127857: 
            return 58188;

        case 127858: 
            return 58189;

        case 127847: 
            return 58431;

        case 127860: 
            return 57411;

        case 9749: 
            return 57413;

        case 127864: 
            return 57412;

        case 127866: 
            return 57415;

        case 127861: 
            return 58168;

        case 127862: 
            return 58123;

        case 127867: 
            return 58124;

        case 8599: 
            return 57910;

        case 8600: 
            return 57912;

        case 8598: 
            return 57911;

        case 8601: 
            return 57913;

        case 11014: 
            return 57906;

        case 11015: 
            return 57907;

        case 10145: 
            return 57908;

        case 11013: 
            return 57909;

        case 9654: 
            return 57914;

        case 9664: 
            return 57915;

        case 9193: 
            return 57916;

        case 9194: 
            return 57917;

        case 11093: 
            return 58162;

        case 10060: 
            return 58163;

        case 10071: 
            return 57377;

        case 10067: 
            return 57376;

        case 10068: 
            return 58166;

        case 10069: 
            return 58167;

        case 10175: 
            return 57873;

        case 10084: 
            return 57378;

        case 128147: 
            return 58151;

        case 128148: 
            return 57379;

        case 128151: 
            return 58152;

        case 128152: 
            return 58153;

        case 128153: 
            return 58154;

        case 128154: 
            return 58155;

        case 128155: 
            return 58156;

        case 128156: 
            return 58157;

        case 128157: 
            return 58423;

        case 128159: 
            return 57860;

        case 9829: 
            return 57868;

        case 9824: 
            return 57870;

        case 9830: 
            return 57869;

        case 9827: 
            return 57871;

        case 128684: 
            return 58126;

        case 128685: 
            return 57864;

        case 9855: 
            return 57866;

        case 9888: 
            return 57938;

        case 128690: 
            return 57654;

        case 128694: 
            return 57857;

        case 128697: 
            return 57656;

        case 128698: 
            return 57657;

        case 128704: 
            return 57663;

        case 128699: 
            return 57681;

        case 128701: 
            return 57664;

        case 128702: 
            return 58121;

        case 128700: 
            return 57658;

        case 127378: 
            return 57876;

        case 127380: 
            return 57897;

        case 127381: 
            return 57874;

        case 127383: 
            return 57933;

        case 127385: 
            return 57875;

        case 127386: 
            return 57646;

        case 127489: 
            return 57859;

        case 127490: 
            return 57896;

        case 127539: 
            return 57899;

        case 127541: 
            return 57898;

        case 127542: 
            return 57877;

        case 127514: 
            return 57878;

        case 127543: 
            return 57879;

        case 127544: 
            return 57880;

        case 127545: 
            return 57895;

        case 127535: 
            return 57900;

        case 127546: 
            return 57901;

        case 12953: 
            return 58133;

        case 12951: 
            return 58125;

        case 127568: 
            return 57894;

        case 128161: 
            return 57615;

        case 128162: 
            return 58164;

        case 128163: 
            return 58129;

        case 128164: 
            return 57660;

        case 128166: 
            return 58161;

        case 128168: 
            return 58160;

        case 128169: 
            return 57434;

        case 128170: 
            return 57676;

        case 10024: 
            return 58158;

        case 10036: 
            return 57861;

        case 10035: 
            return 57862;

        case 128308: 
            return 57881;

        case 128306: 
            return 57882;

        case 128307: 
            return 57883;

        case 11088: 
            return 58159;

        case 128266: 
            return 57665;

        case 128269: 
            return 57620;

        case 128274: 
            return 57668;

        case 128275: 
            return 57669;

        case 128273: 
            return 57407;

        case 128276: 
            return 58149;

        case 128285: 
            return 57932;

        case 9994: 
            return 57360;

        case 9995: 
            return 57362;

        case 9996: 
            return 57361;

        case 128074: 
            return 57357;

        case 128077: 
            return 57358;

        case 9757: 
            return 57359;

        case 128070: 
            return 57902;

        case 128071: 
            return 57903;

        case 128072: 
            return 57904;

        case 128073: 
            return 57905;

        case 128075: 
            return 58398;

        case 128079: 
            return 58399;

        case 128076: 
            return 58400;

        case 128078: 
            return 58401;

        case 128080: 
            return 58402;
        }
    }

    public static int h(int i)
    {
        if (c)
        {
            return 1;
        } else
        {
            return Character.charCount(i);
        }
    }

    static 
    {
        Object obj;
        Object aobj[];
        byte byte0;
        int i;
        boolean flag;
        flag = true;
        aobj = new String[60];
        obj = "\004=";
        byte0 = -1;
        i = 0;
_L71:
        String as[];
        int k;
        int l;
        as = ((String []) (aobj));
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L69:
        if (l > k) goto _L2; else goto _L1
_L1:
        obj = (new String(((char []) (obj)))).intern();
        byte0;
        JVM INSTR tableswitch 0 58: default 300
    //                   0 316
    //                   1 332
    //                   2 348
    //                   3 364
    //                   4 380
    //                   5 397
    //                   6 415
    //                   7 433
    //                   8 451
    //                   9 469
    //                   10 487
    //                   11 505
    //                   12 523
    //                   13 541
    //                   14 559
    //                   15 577
    //                   16 595
    //                   17 613
    //                   18 631
    //                   19 649
    //                   20 667
    //                   21 685
    //                   22 703
    //                   23 721
    //                   24 739
    //                   25 757
    //                   26 775
    //                   27 793
    //                   28 811
    //                   29 829
    //                   30 847
    //                   31 865
    //                   32 883
    //                   33 901
    //                   34 919
    //                   35 937
    //                   36 955
    //                   37 973
    //                   38 991
    //                   39 1009
    //                   40 1027
    //                   41 1045
    //                   42 1063
    //                   43 1081
    //                   44 1099
    //                   45 1117
    //                   46 1135
    //                   47 1153
    //                   48 1171
    //                   49 1189
    //                   50 1207
    //                   51 1225
    //                   52 1243
    //                   53 1261
    //                   54 1279
    //                   55 1297
    //                   56 1315
    //                   57 1333
    //                   58 1351;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59 _L60 _L61 _L62
_L3:
        as[i] = ((String) (obj));
        obj = "\0202";
        i = 1;
        byte0 = 0;
        break; /* Loop/switch isn't completed */
_L4:
        as[i] = ((String) (obj));
        i = 2;
        obj = "\016,";
        byte0 = 1;
        break; /* Loop/switch isn't completed */
_L5:
        as[i] = ((String) (obj));
        i = 3;
        obj = "\005'";
        byte0 = 2;
        break; /* Loop/switch isn't completed */
_L6:
        as[i] = ((String) (obj));
        i = 4;
        obj = "\0230";
        byte0 = 3;
        break; /* Loop/switch isn't completed */
_L7:
        as[i] = ((String) (obj));
        i = 5;
        obj = "\027\"";
        byte0 = 4;
        break; /* Loop/switch isn't completed */
_L8:
        as[i] = ((String) (obj));
        i = 6;
        obj = "\0177";
        byte0 = 5;
        break; /* Loop/switch isn't completed */
_L9:
        as[i] = ((String) (obj));
        obj = "\001'";
        byte0 = 6;
        i = 7;
        break; /* Loop/switch isn't completed */
_L10:
        as[i] = ((String) (obj));
        i = 8;
        obj = "\0014";
        byte0 = 7;
        break; /* Loop/switch isn't completed */
_L11:
        as[i] = ((String) (obj));
        i = 9;
        obj = "\004'";
        byte0 = 8;
        break; /* Loop/switch isn't completed */
_L12:
        as[i] = ((String) (obj));
        obj = "\0204";
        byte0 = 9;
        i = 10;
        break; /* Loop/switch isn't completed */
_L13:
        as[i] = ((String) (obj));
        i = 11;
        obj = "\027=";
        byte0 = 10;
        break; /* Loop/switch isn't completed */
_L14:
        as[i] = ((String) (obj));
        i = 12;
        obj = "\007/";
        byte0 = 11;
        break; /* Loop/switch isn't completed */
_L15:
        as[i] = ((String) (obj));
        i = 13;
        obj = "\0264";
        byte0 = 12;
        break; /* Loop/switch isn't completed */
_L16:
        as[i] = ((String) (obj));
        i = 14;
        obj = "\r9";
        byte0 = 13;
        break; /* Loop/switch isn't completed */
_L17:
        as[i] = ((String) (obj));
        i = 15;
        obj = "\000<";
        byte0 = 14;
        break; /* Loop/switch isn't completed */
_L18:
        as[i] = ((String) (obj));
        i = 16;
        obj = "\t:";
        byte0 = 15;
        break; /* Loop/switch isn't completed */
_L19:
        as[i] = ((String) (obj));
        i = 17;
        obj = "\r2";
        byte0 = 16;
        break; /* Loop/switch isn't completed */
_L20:
        as[i] = ((String) (obj));
        i = 18;
        obj = "\026&";
        byte0 = 17;
        break; /* Loop/switch isn't completed */
_L21:
        as[i] = ((String) (obj));
        obj = "\0062";
        byte0 = 18;
        i = 19;
        break; /* Loop/switch isn't completed */
_L22:
        as[i] = ((String) (obj));
        i = 20;
        obj = "\0008";
        byte0 = 19;
        break; /* Loop/switch isn't completed */
_L23:
        as[i] = ((String) (obj));
        i = 21;
        obj = "\0066";
        byte0 = 20;
        break; /* Loop/switch isn't completed */
_L24:
        as[i] = ((String) (obj));
        i = 22;
        obj = "\n9";
        byte0 = 21;
        break; /* Loop/switch isn't completed */
_L25:
        as[i] = ((String) (obj));
        i = 23;
        obj = "\013'";
        byte0 = 22;
        break; /* Loop/switch isn't completed */
_L26:
        as[i] = ((String) (obj));
        i = 24;
        obj = "\002!";
        byte0 = 23;
        break; /* Loop/switch isn't completed */
_L27:
        as[i] = ((String) (obj));
        i = 25;
        obj = "\000=";
        byte0 = 24;
        break; /* Loop/switch isn't completed */
_L28:
        as[i] = ((String) (obj));
        i = 26;
        obj = "\b/";
        byte0 = 25;
        break; /* Loop/switch isn't completed */
_L29:
        as[i] = ((String) (obj));
        i = 27;
        obj = "\000;";
        byte0 = 26;
        break; /* Loop/switch isn't completed */
_L30:
        as[i] = ((String) (obj));
        i = 28;
        obj = "\0004";
        byte0 = 27;
        break; /* Loop/switch isn't completed */
_L31:
        as[i] = ((String) (obj));
        i = 29;
        obj = "\0330";
        byte0 = 28;
        break; /* Loop/switch isn't completed */
_L32:
        as[i] = ((String) (obj));
        i = 30;
        obj = "\013>";
        byte0 = 29;
        break; /* Loop/switch isn't completed */
_L33:
        as[i] = ((String) (obj));
        i = 31;
        obj = "\020,";
        byte0 = 30;
        break; /* Loop/switch isn't completed */
_L34:
        as[i] = ((String) (obj));
        i = 32;
        obj = "\t%";
        byte0 = 31;
        break; /* Loop/switch isn't completed */
_L35:
        as[i] = ((String) (obj));
        i = 33;
        obj = "\002 ";
        byte0 = 32;
        break; /* Loop/switch isn't completed */
_L36:
        as[i] = ((String) (obj));
        i = 34;
        obj = "\000:";
        byte0 = 33;
        break; /* Loop/switch isn't completed */
_L37:
        as[i] = ((String) (obj));
        i = 35;
        obj = "\n!";
        byte0 = 34;
        break; /* Loop/switch isn't completed */
_L38:
        as[i] = ((String) (obj));
        i = 36;
        obj = "\0047";
        byte0 = 35;
        break; /* Loop/switch isn't completed */
_L39:
        as[i] = ((String) (obj));
        i = 37;
        obj = "\n'";
        byte0 = 36;
        break; /* Loop/switch isn't completed */
_L40:
        as[i] = ((String) (obj));
        i = 38;
        obj = "\0010";
        byte0 = 37;
        break; /* Loop/switch isn't completed */
_L41:
        as[i] = ((String) (obj));
        i = 39;
        obj = "\023!";
        byte0 = 38;
        break; /* Loop/switch isn't completed */
_L42:
        as[i] = ((String) (obj));
        i = 40;
        obj = "\b'";
        byte0 = 39;
        break; /* Loop/switch isn't completed */
_L43:
        as[i] = ((String) (obj));
        i = 41;
        obj = "\026,";
        byte0 = 40;
        break; /* Loop/switch isn't completed */
_L44:
        as[i] = ((String) (obj));
        i = 42;
        obj = "\n;";
        byte0 = 41;
        break; /* Loop/switch isn't completed */
_L45:
        as[i] = ((String) (obj));
        i = 43;
        obj = "\0020";
        byte0 = 42;
        break; /* Loop/switch isn't completed */
_L46:
        as[i] = ((String) (obj));
        i = 44;
        obj = "\0070";
        byte0 = 43;
        break; /* Loop/switch isn't completed */
_L47:
        as[i] = ((String) (obj));
        i = 45;
        obj = "\000'";
        byte0 = 44;
        break; /* Loop/switch isn't completed */
_L48:
        as[i] = ((String) (obj));
        i = 46;
        obj = "\0250";
        byte0 = 45;
        break; /* Loop/switch isn't completed */
_L49:
        as[i] = ((String) (obj));
        i = 47;
        obj = "\006&";
        byte0 = 46;
        break; /* Loop/switch isn't completed */
_L50:
        as[i] = ((String) (obj));
        i = 48;
        obj = "\013;";
        byte0 = 47;
        break; /* Loop/switch isn't completed */
_L51:
        as[i] = ((String) (obj));
        i = 49;
        obj = "\002'";
        byte0 = 48;
        break; /* Loop/switch isn't completed */
_L52:
        as[i] = ((String) (obj));
        i = 50;
        obj = "\0009";
        byte0 = 49;
        break; /* Loop/switch isn't completed */
_L53:
        as[i] = ((String) (obj));
        i = 51;
        obj = "\021 ";
        byte0 = 50;
        break; /* Loop/switch isn't completed */
_L54:
        as[i] = ((String) (obj));
        i = 52;
        obj = "\n1";
        byte0 = 51;
        break; /* Loop/switch isn't completed */
_L55:
        as[i] = ((String) (obj));
        i = 53;
        obj = "\016-";
        byte0 = 52;
        break; /* Loop/switch isn't completed */
_L56:
        as[i] = ((String) (obj));
        i = 54;
        obj = "\0314";
        byte0 = 53;
        break; /* Loop/switch isn't completed */
_L57:
        as[i] = ((String) (obj));
        i = 55;
        obj = "\027'";
        byte0 = 54;
        break; /* Loop/switch isn't completed */
_L58:
        as[i] = ((String) (obj));
        i = 56;
        obj = "'\007=}f!\0319";
        byte0 = 55;
        break; /* Loop/switch isn't completed */
_L59:
        as[i] = ((String) (obj));
        i = 57;
        obj = "&\030\003";
        byte0 = 56;
        break; /* Loop/switch isn't completed */
_L60:
        as[i] = ((String) (obj));
        i = 58;
        obj = "&\0303`n6\0015f($\020(oj,\0375cd,\033>sd,\0219%";
        byte0 = 57;
        break; /* Loop/switch isn't completed */
_L61:
        as[i] = ((String) (obj));
        i = 59;
        obj = " \0321$p+\024(yf3\005";
        byte0 = 58;
        break; /* Loop/switch isn't completed */
_L62:
        int j;
        as[i] = ((String) (obj));
        z = ((String []) (aobj));
        obj = Build.MANUFACTURER;
        aobj = "\020\0322s".toCharArray();
        j = aobj.length;
        i = 0;
          goto _L63
_L2:
        c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1500
    //                   0 1523
    //                   1 1530
    //                   2 1537
    //                   3 1544;
           goto _L64 _L65 _L66 _L67 _L68
_L68:
        break MISSING_BLOCK_LABEL_1544;
_L64:
        byte2 = 7;
_L70:
        obj[k] = (char)(byte2 ^ c1);
        k++;
          goto _L69
_L65:
        byte2 = 67;
          goto _L70
_L66:
        byte2 = 117;
          goto _L70
_L67:
        byte2 = 92;
          goto _L70
        byte2 = 10;
          goto _L70
        if (true) goto _L71; else goto _L2
_L63:
        if (j <= i)
        {
            byte byte1;
            byte byte2;
            char c1;
            if (!((String) (obj)).startsWith((new String(((char []) (aobj)))).intern()) || android.os.Build.VERSION.SDK_INT >= 19)
            {
                flag = false;
            }
            c = flag;
            e = new SparseIntArray(900);
            d = new ck();
            b = new b3();
            a = new ax();
            return;
        }
        k = aobj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1592
    //                   0 1613
    //                   1 1619
    //                   2 1625
    //                   3 1631;
           goto _L72 _L73 _L74 _L75 _L76
_L76:
        break MISSING_BLOCK_LABEL_1631;
_L72:
        byte1 = 7;
_L77:
        aobj[i] = (char)(byte1 ^ k);
        i++;
          goto _L63
_L73:
        byte1 = 67;
          goto _L77
_L74:
        byte1 = 117;
          goto _L77
_L75:
        byte1 = 92;
          goto _L77
        byte1 = 10;
          goto _L77
    }
}
