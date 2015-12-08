// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.text.CharacterIterator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.StringCharacterIterator;
import java.util.Date;

// Referenced classes of package io.card.payment:
//            e, l

class s
{

    private final Paint a = new Paint();
    private Bitmap b;
    private boolean c;
    private final Context d;

    public s(Context context)
    {
        a.setAntiAlias(true);
        a.setAlpha(100);
        b = null;
        d = context;
    }

    public static String a(String s1, boolean flag, e e1)
    {
        String s2;
        e e2;
        int i;
        if (flag)
        {
            s2 = c(s1);
        } else
        {
            s2 = s1;
        }
        e2 = e1;
        if (e1 == null)
        {
            e2 = e.a(s2);
        }
        i = e2.a();
        e1 = s1;
        if (s2.length() == i)
        {
            if (i == 16)
            {
                s1 = new StringBuilder();
                for (i = 0; i < 16; i++)
                {
                    if (i != 0 && i % 4 == 0)
                    {
                        s1.append(' ');
                    }
                    s1.append(s2.charAt(i));
                }

                e1 = s1.toString();
            } else
            {
                e1 = s1;
                if (i == 15)
                {
                    return d(s2);
                }
            }
        }
        return e1;
    }

    public static boolean a(String s1)
    {
        char c1;
        int ai[];
        int ai1[];
        int i;
        int j;
        ai = (new int[] {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        });
        ai1 = (new int[] {
            0, 2, 4, 6, 8, 1, 3, 5, 7, 9
        });
        s1 = new StringCharacterIterator(s1);
        c1 = s1.last();
        j = 0;
        i = 0;
_L7:
        if (c1 == '\uFFFF') goto _L2; else goto _L1
_L1:
        if (Character.isDigit(c1)) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        j += (new int[][] {
            ai, ai1
        })[i & 1][c1 - 48];
        c1 = s1.previous();
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (j % 10 != 0) goto _L3; else goto _L5
_L5:
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static Date b(String s1)
    {
        Date date = null;
        String s2 = c(s1);
        int i = s2.length();
        if (i == 4)
        {
            s1 = new SimpleDateFormat("MMyy");
        } else
        if (i == 6)
        {
            s1 = new SimpleDateFormat("MMyyyy");
        } else
        {
            s1 = null;
        }
        if (s1 != null)
        {
            try
            {
                s1.setLenient(false);
                date = s1.parse(s2);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return null;
            }
        }
        return date;
    }

    public static String c(String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        s1 = s1.toCharArray();
        int j = s1.length;
        for (int i = 0; i < j; i++)
        {
            char c1 = s1[i];
            if (Character.isDigit(c1))
            {
                stringbuilder.append(c1);
            }
        }

        return stringbuilder.toString();
    }

    private static String d(String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < 15; i++)
        {
            if (i == 4 || i == 10)
            {
                stringbuilder.append(' ');
            }
            stringbuilder.append(s1.charAt(i));
        }

        return stringbuilder.toString();
    }

    public void a(Canvas canvas, float f, float f1)
    {
        if (b == null)
        {
            a(false);
        }
        canvas.save();
        float f2 = (float)b.getHeight() / (float)b.getWidth();
        if (f1 / f < f2)
        {
            f = f1 / f2;
        } else
        {
            f1 = f * f2;
        }
        f /= 2.0F;
        f1 /= 2.0F;
        canvas.drawBitmap(b, new Rect(0, 0, b.getWidth(), b.getHeight()), new RectF(-f, -f1, f, f1), a);
        canvas.restore();
    }

    void a(boolean flag)
    {
        if (b != null && flag == c)
        {
            return;
        }
        c = flag;
        if (flag)
        {
            b = l.a("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", d, 240);
            return;
        } else
        {
            b = l.a("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", d, 240);
            return;
        }
    }
}
