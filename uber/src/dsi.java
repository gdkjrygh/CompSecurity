// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import com.ubercab.client.core.contacts.Contact;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dsi
    implements drw
{

    private final int a;
    private final int b;
    private final Context c;
    private final Rect d = new Rect();
    private final Paint e = new Paint(1);
    private final Drawable f;

    public dsi(Context context)
    {
        c = context;
        Resources resources = context.getResources();
        a = resources.getDimensionPixelSize(0x7f08006e);
        b = resources.getDimensionPixelSize(0x7f08006f);
        f = c.getResources().getDrawable(0x7f020315);
        e.setTypeface(hoq.b(context));
        e.setTextSize(resources.getDimensionPixelSize(0x7f08024f));
        e.getTextBounds("W", 0, 1, d);
    }

    private com.ubercab.client.core.ui.ChipEditText.Chip a(Contact contact, String s)
    {
        Bundle bundle = null;
        if (contact == null)
        {
            return null;
        }
        String s1 = contact.a();
        Bitmap bitmap = bundle;
        if (contact.c() != null)
        {
            byte abyte0[] = duk.a(c, contact.c());
            bitmap = bundle;
            if (abyte0 != null)
            {
                bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
            }
        }
        bundle = new Bundle();
        bundle.putString("name", s1);
        bundle.putString("number", contact.b());
        bundle.putString("email", contact.d());
        bundle.putParcelable("photo", bitmap);
        bundle.putParcelable("contact", contact);
        if (!TextUtils.isEmpty(s1))
        {
            contact = String.format("%s (%s)", new Object[] {
                s1, s
            });
        } else
        {
            contact = s;
        }
        return new com.ubercab.client.core.ui.ChipEditText.Chip(s, bundle, contact);
    }

    public final Bitmap a(com.ubercab.client.core.ui.ChipEditText.Chip chip, int i)
    {
        Object obj = chip.b();
        ((Bundle) (obj)).setClassLoader(c.getClassLoader());
        Bitmap bitmap = (Bitmap)((Bundle) (obj)).getParcelable("photo");
        chip = ((Bundle) (obj)).getString("name");
        obj = ((Bundle) (obj)).getString("number");
        float f1;
        float f2;
        float f3;
        float f4;
        Canvas canvas;
        int j;
        if (TextUtils.isEmpty(chip))
        {
            chip = ((com.ubercab.client.core.ui.ChipEditText.Chip) (obj));
        }
        j = (int)(e.measureText(chip) + (float)(a * 2));
        f2 = a;
        f3 = (float)i / 2.0F;
        f4 = (float)d.height() / 2.0F;
        if (bitmap != null)
        {
            j += i;
        }
        obj = Bitmap.createBitmap(b + j, i, android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(((Bitmap) (obj)));
        f.setBounds(0, 0, j, i);
        f.draw(canvas);
        f1 = f2;
        if (bitmap != null)
        {
            Paint paint = new Paint();
            paint.setFilterBitmap(true);
            canvas.drawBitmap(bitmap, null, new Rect(a, a, i - a, i - a), paint);
            f1 = f2 + (float)(i - a / 2);
        }
        canvas.drawText(chip, 0, chip.length(), f1, f4 + f3, e);
        return ((Bitmap) (obj));
    }

    public final Contact a(com.ubercab.client.core.ui.ChipEditText.Chip chip)
    {
        chip = chip.b();
        chip.setClassLoader(c.getClassLoader());
        return (Contact)chip.getParcelable("contact");
    }

    public com.ubercab.client.core.ui.ChipEditText.Chip a(String s)
    {
        Contact contact = null;
        if (!Patterns.EMAIL_ADDRESS.matcher(s).matches()) goto _L2; else goto _L1
_L1:
        Contact contact1 = Contact.b(c, s);
        contact = contact1;
        if (contact1 == null)
        {
            contact = (new dab()).a(s).b(s).a();
        }
_L4:
        return a(contact, s);
_L2:
        if (Patterns.PHONE.matcher(s).matches())
        {
            Contact contact2 = Contact.a(c, s);
            contact = contact2;
            if (contact2 == null)
            {
                contact = (new dab()).a(s).c(s).a();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
