// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.backport.util.Base64;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.support.v4.text.BidiFormatter;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.bg;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.aw;
import com.whatsapp.util.m;
import com.whatsapp.util.y;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            ConversationRowMedia, App, al9, w0, 
//            CircularProgressBar, TextEmojiLabel, ao5, MediaData, 
//            w5, og, iz, ConversationRowText, 
//            a1g, Conversation, MediaGallery, MediaView

public class ConversationRowImage extends ConversationRowMedia
{

    private static final Drawable P;
    private static aw R;
    private static final Drawable S;
    private static final Drawable W;
    private static final Drawable X;
    private static final String ab[];
    private aw N;
    private final TextEmojiLabel O = (TextEmojiLabel)findViewById(0x7f0b0182);
    private final View Q = findViewById(0x7f0b0181);
    private final TextView T = (TextView)findViewById(0x7f0b017b);
    private final CircularProgressBar U = (CircularProgressBar)findViewById(0x7f0b0088);
    private final RowImageView V = (RowImageView)findViewById(0x7f0b0141);
    private final View Y = findViewById(0x7f0b0180);

    public ConversationRowImage(Context context, c4 c4_1)
    {
        super(context, c4_1);
        N = new w0(this);
        O.setLinkHandler(new ao5());
        O.setAutoLinkMask(0);
        O.setLinksClickable(false);
        O.setFocusable(false);
        O.setClickable(false);
        O.setLongClickable(false);
        c(c4_1);
    }

    static Drawable a()
    {
        return P;
    }

    static RowImageView a(ConversationRowImage conversationrowimage)
    {
        return conversationrowimage.V;
    }

    static Drawable b()
    {
        return X;
    }

    static Drawable c()
    {
        return W;
    }

    private void c(c4 c4_1)
    {
        MediaData mediadata;
        boolean flag;
        boolean flag1;
        int k;
        flag1 = true;
        flag = false;
        k = App.am;
        mediadata = (MediaData)c4_1.B;
        com.whatsapp.RowImageView.a(V, null);
        com.whatsapp.RowImageView.a(V, mediadata);
        if (!mediadata.transferring) goto _L2; else goto _L1
_L1:
        boolean flag2;
        Y.setVisibility(0);
        U.setVisibility(0);
        Q.setVisibility(0);
        T.setText("");
        T.setVisibility(8);
        flag2 = c4_1.y.b;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        setOnClickListener(J);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        Object obj;
        int i;
        int j;
        try
        {
            setOnClickListener(null);
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        T.setOnClickListener(K);
        U.setOnClickListener(K);
        j = (int)mediadata.progress;
        i = j;
        if (mediadata.transcoder == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        flag2 = mediadata.transcoder.h();
        i = j;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        Object obj1;
        View view;
        try
        {
            obj = mediadata.uploader;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        i = j;
        if (obj == null)
        {
            j /= 2;
            i = j;
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_224;
            }
            i = j;
        }
        i = i / 2 + 50;
        try
        {
            obj = U;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (i == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        try
        {
            ((CircularProgressBar) (obj)).setIndeterminate(flag2);
            U.setProgress(i);
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1) { }
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1) { }
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1) { }
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1) { }
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1) { }
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1) { }
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1) { }
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        if (k == 0) goto _L3; else goto _L2
_L2:
        flag2 = mediadata.transferred;
        if (flag2) goto _L5; else goto _L4
_L4:
        flag2 = c4_1.E;
        if (!flag2) goto _L7; else goto _L6
_L6:
        flag2 = c4_1.y.b;
        if (!flag2) goto _L7; else goto _L8
_L8:
        flag2 = og.e(c4_1.y.a);
        if (flag2) goto _L7; else goto _L5
_L5:
        Y.setVisibility(8);
        T.setText(0x7f0e02eb);
        T.setVisibility(8);
        U.setVisibility(8);
        Q.setVisibility(8);
        T.setOnClickListener(J);
        setOnClickListener(J);
        if (k == 0) goto _L3; else goto _L7
_L7:
        Y.setVisibility(0);
        U.setVisibility(8);
        Q.setVisibility(8);
        T.setVisibility(0);
        flag2 = c4_1.y.b;
        if (!flag2) goto _L10; else goto _L9
_L9:
        obj = mediadata.file;
        if (obj != null) goto _L10; else goto _L11
_L11:
        obj = c4_1.l;
        if (obj == null) goto _L10; else goto _L12
_L12:
        i = 1;
_L27:
        flag2 = c4_1.y.b;
        if (!flag2 || i != 0)
        {
            break MISSING_BLOCK_LABEL_517;
        }
        T.setText(0x7f0e0361);
        T.setCompoundDrawablesWithIntrinsicBounds(0x7f0200f0, 0, 0, 0);
        T.setOnClickListener(M);
        setOnClickListener(J);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_566;
        }
        try
        {
            T.setText(Formatter.formatShortFileSize(App.au, c4_1.t));
            T.setCompoundDrawablesWithIntrinsicBounds(0x7f0200c3, 0, 0, 0);
            T.setOnClickListener(L);
            setOnClickListener(L);
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        T.setVisibility(0);
_L3:
        view = findViewById(0x7f0b0183);
        if (TextUtils.isEmpty(c4_1.b)) goto _L14; else goto _L13
_L13:
        O.setVisibility(0);
        if (!App.aR())
        {
            break MISSING_BLOCK_LABEL_1448;
        }
        i = c4_1.b.lastIndexOf('\n');
        if (i > 0)
        {
            try
            {
                obj = c4_1.b.substring(i);
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        } else
        {
            obj = c4_1.b;
        }
        if (com.whatsapp.iz.a.isRtl(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_1448;
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(-2, 0), android.view.View.MeasureSpec.makeMeasureSpec(-2, 0));
        i = view.getMeasuredWidth();
_L31:
        obj1 = c4_1.b;
        obj = obj1;
        if (i == 0)
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append("\n").toString();
        }
        try
        {
            ConversationRowText.setMessageText(((String) (obj)), O, i, c4_1);
            t.setTextColor(getContext().getResources().getColor(0x7f09001b));
            view.setPadding(getResources().getDimensionPixelSize(0x7f0a0027), 0, getResources().getDimensionPixelSize(0x7f0a0027), getResources().getDimensionPixelSize(0x7f0a0025));
            com.whatsapp.RowImageView.a(V, false);
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (k == 0) goto _L15; else goto _L14
_L14:
        O.setVisibility(8);
        t.setTextColor(getContext().getResources().getColor(0x7f09001c));
        view.setPadding(getResources().getDimensionPixelSize(0x7f0a0028), 0, getResources().getDimensionPixelSize(0x7f0a0028), getResources().getDimensionPixelSize(0x7f0a0026));
        com.whatsapp.RowImageView.a(V, true);
_L15:
        RowImageView.b(V, c4_1.y.b);
        if (t == null)
        {
            break MISSING_BLOCK_LABEL_948;
        }
        flag2 = c4_1.E;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_937;
        }
        flag2 = c4_1.y.b;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_937;
        }
        flag2 = og.g(c4_1.y.a);
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_937;
        }
        t.setCompoundDrawablesWithIntrinsicBounds(0x7f0200bb, 0, 0, 0);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_948;
        }
        try
        {
            t.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        obj1 = new android.graphics.BitmapFactory.Options();
        obj1.inJustDecodeBounds = true;
        if (mediadata.file == null) goto _L17; else goto _L16
_L16:
        flag2 = mediadata.file.exists();
        if (!flag2) goto _L17; else goto _L18
_L18:
        i = ((flag1) ? 1 : 0);
_L28:
        if (i == 0) goto _L20; else goto _L19
_L19:
        try
        {
            BitmapFactory.decodeFile(mediadata.file.getAbsolutePath(), ((android.graphics.BitmapFactory.Options) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (k == 0) goto _L21; else goto _L20
_L20:
        if (c4_1.f != 0) goto _L23; else goto _L22
_L22:
        obj = c4_1.e();
        if (obj == null) goto _L25; else goto _L24
_L24:
        try
        {
            j = c4_1.e().length();
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (j <= 0) goto _L25; else goto _L26
_L26:
        obj = Base64.decode(c4_1.e(), 0);
_L29:
        if (obj != null)
        {
            try
            {
                BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, ((android.graphics.BitmapFactory.Options) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
_L21:
        try
        {
            if (((android.graphics.BitmapFactory.Options) (obj1)).outWidth <= 0)
            {
                break MISSING_BLOCK_LABEL_1201;
            }
            j = ((android.graphics.BitmapFactory.Options) (obj1)).outHeight;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_1201;
        }
        j = ((flag) ? 1 : 0);
        if (i != 0)
        {
            try
            {
                j = (new ExifInterface(mediadata.file.getAbsolutePath())).getAttributeInt(ab[15], 1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                j = ((flag) ? 1 : 0);
            }
        }
        if (j == 6 || j == 8)
        {
            try
            {
                com.whatsapp.RowImageView.a(V, ((android.graphics.BitmapFactory.Options) (obj1)).outHeight);
                RowImageView.b(V, ((android.graphics.BitmapFactory.Options) (obj1)).outWidth);
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_1184;
            }
        }
        com.whatsapp.RowImageView.a(V, ((android.graphics.BitmapFactory.Options) (obj1)).outWidth);
        RowImageView.b(V, ((android.graphics.BitmapFactory.Options) (obj1)).outHeight);
        try
        {
            y.c(c4_1, V, N);
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_1241;
        }
        com.whatsapp.RowImageView.a(V, com.whatsapp.a1g.a().H);
        RowImageView.b(V, com.whatsapp.RowImageView.a(V));
        y.c(c4_1, V, R);
        try
        {
            V.requestLayout();
            obj = Conversation.ar;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1278;
        }
        if (Conversation.ar.equals(c4_1.y))
        {
            Conversation.ar = null;
            b(c4_1);
        }
        return;
        c4_1;
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        throw c4_1;
        c4_1;
        throw c4_1;
_L10:
        i = 0;
          goto _L27
        c4_1;
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        throw c4_1;
        c4_1;
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        throw c4_1;
        c4_1;
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
_L17:
        i = 0;
          goto _L28
        c4_1;
        throw c4_1;
        obj;
_L30:
        obj = null;
          goto _L29
_L23:
        obj = c4_1.a();
          goto _L29
        obj;
          goto _L30
        obj;
          goto _L30
_L25:
        obj = null;
          goto _L29
        i = 0;
          goto _L31
    }

    static Drawable d()
    {
        return S;
    }

    protected int a(int i)
    {
        int k;
        int l;
        k = 0x7f0205b9;
        l = App.am;
        if (TextUtils.isEmpty(C.b)) goto _L2; else goto _L1
_L1:
        k = super.a(i);
_L4:
        return k;
        ArrayIndexOutOfBoundsException arrayindexoutofboundsexception;
        arrayindexoutofboundsexception;
        throw arrayindexoutofboundsexception;
_L2:
label0:
        {
            int j;
            if (bg.a(i, 13) >= 0)
            {
                j = 0x7f0205b3;
                if (l == 0)
                {
                    break label0;
                }
            }
            try
            {
                j = bg.a(i, 5);
            }
            catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception1)
            {
                throw arrayindexoutofboundsexception1;
            }
            if (j >= 0)
            {
                j = 0x7f0205b7;
                if (l == 0)
                {
                    break label0;
                }
            }
            try
            {
                j = bg.a(i, 4);
            }
            catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception2)
            {
                throw arrayindexoutofboundsexception2;
            }
            if (j == 0)
            {
                j = 0x7f0205b5;
                if (l == 0)
                {
                    break label0;
                }
            }
            j = 0x7f0205b9;
        }
        try
        {
            l = App.l;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception3)
        {
            throw arrayindexoutofboundsexception3;
        }
        if (l != 3 || i != 7)
        {
            return j;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a()
    {
        super.a();
        c(C);
    }

    public void a(c4 c4_1, boolean flag)
    {
        boolean flag1;
        if (!flag)
        {
            c4 c4_2;
            try
            {
                c4_2 = C;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
            if (c4_1 == c4_2)
            {
                break MISSING_BLOCK_LABEL_37;
            }
        }
        flag1 = true;
_L1:
        try
        {
            super.a(c4_1, flag);
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        c(c4_1);
        return;
        flag1 = false;
          goto _L1
    }

    protected void b(c4 c4_1)
    {
        Object obj = (MediaData)c4_1.B;
        boolean flag = c4_1.y.b;
        if (!flag)
        {
            try
            {
                if (!((MediaData) (obj)).transferred)
                {
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        break MISSING_BLOCK_LABEL_34;
        c4_1;
        throw c4_1;
        boolean flag1;
        if (((MediaData) (obj)).file != null)
        {
            flag1 = (new File(Uri.fromFile(((MediaData) (obj)).file).getPath())).exists();
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            obj = new Intent(getContext(), com/whatsapp/MediaGallery);
            ((Intent) (obj)).putExtra(ab[9], -1);
            ((Intent) (obj)).putExtra(ab[1], true);
            ((Intent) (obj)).putExtra(ab[12], c4_1.y.a);
            ((Intent) (obj)).putExtra(ab[2], c4_1.y.hashCode());
            getContext().startActivity(((Intent) (obj)));
            return;
        }
        Log.i((new StringBuilder()).append(ab[6]).append(c4_1.y.b).append(ab[8]).append(c4_1.w).append(ab[0]).append(c4_1.L).append(ab[10]).append(c4_1.l).append(ab[11]).append(((MediaData) (obj)).file).append(ab[14]).append(((MediaData) (obj)).progress).append(ab[13]).append(((MediaData) (obj)).transferred).append(ab[7]).append(((MediaData) (obj)).transferring).append(ab[4]).append(((MediaData) (obj)).fileSize).append(ab[5]).append(c4_1.t).append(ab[3]).append(c4_1.I).toString());
        c4_1 = com.whatsapp.MediaView.a(c4_1, c4_1.y.a, getContext(), V);
        getContext().startActivity(c4_1);
        flag1 = MediaView.c();
        if (flag1)
        {
            try
            {
                if (getContext() instanceof Activity)
                {
                    ((Activity)getContext()).overridePendingTransition(0, 0);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        break MISSING_BLOCK_LABEL_406;
        c4_1;
        throw c4_1;
    }

    protected int n()
    {
        return 0x7f030046;
    }

    protected int q()
    {
        return 0x7f030047;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[16];
        obj = "R\031v5tH";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\023\033r*e";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\031\022n";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "R\003~5t\001\003v5aH";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "R\021~4t!\036m=+";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "R\032r<x\023(d1k\027M";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\004\036r/|\027\004d9v\027X7>c\035\032H5tH";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "R\003e9\177\001\021r*c\033\031pb";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "R\003n(tH";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\002\030d";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "R\002e4+";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "R\021~4tH";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\030\036s";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "R\003e9\177\001\021r*c\027\023-";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "R\007e7v\000\022d++";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "=\005~=\177\006\026c1~\034";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                ab = as;
                P = new m(App.au.getApplicationContext().getResources().getDrawable(0x7f0200a7));
                S = new m(App.au.getApplicationContext().getResources().getDrawable(0x7f0200a8));
                X = new m(App.au.getApplicationContext().getResources().getDrawable(0x7f0200b0));
                W = new m(App.au.getApplicationContext().getResources().getDrawable(0x7f0200b1));
                R = new al9();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 540
    //                   0 563
    //                   1 570
    //                   2 577
    //                   3 584;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_584;
_L3:
        byte byte1 = 17;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 114;
          goto _L9
_L5:
        byte1 = 119;
          goto _L9
_L6:
        byte1 = 23;
          goto _L9
        byte1 = 88;
          goto _L9
    }

    private class RowImageView extends ImageView
    {

        private boolean a;
        private int b;
        private boolean c;
        private MediaData d;
        private Bitmap e;
        private Paint f;
        private int g;

        static int a(RowImageView rowimageview)
        {
            return rowimageview.g;
        }

        static int a(RowImageView rowimageview, int i)
        {
            rowimageview.g = i;
            return i;
        }

        static Bitmap a(RowImageView rowimageview, Bitmap bitmap)
        {
            rowimageview.e = bitmap;
            return bitmap;
        }

        static MediaData a(RowImageView rowimageview, MediaData mediadata)
        {
            rowimageview.d = mediadata;
            return mediadata;
        }

        private void a()
        {
            f.setAntiAlias(true);
            f.setDither(true);
            f.setFilterBitmap(true);
            f.setColor(-1);
        }

        static boolean a(RowImageView rowimageview, boolean flag)
        {
            rowimageview.c = flag;
            return flag;
        }

        static int b(RowImageView rowimageview, int i)
        {
            rowimageview.b = i;
            return i;
        }

        static boolean b(RowImageView rowimageview, boolean flag)
        {
            rowimageview.a = flag;
            return flag;
        }

        protected void onDraw(Canvas canvas)
        {
            Object obj;
label0:
            {
label1:
                {
                    int j = App.am;
                    f.setColor(-1);
                    Rect rect = new Rect(0, 0, getWidth(), getHeight());
                    if (e == null)
                    {
                        break label0;
                    }
                    obj = new Rect(0, 0, e.getWidth(), e.getHeight());
                    if (e.getHeight() > e.getWidth())
                    {
                        obj.bottom = e.getWidth();
                        int i;
                        if (d.faceY > 0)
                        {
                            i = d.faceY;
                        } else
                        {
                            i = b / 3;
                        }
                        if (i > g / 3)
                        {
                            int k = ((Rect) (obj)).bottom;
                            obj.bottom = Math.min(e.getHeight(), (i * e.getHeight()) / b + (k * 2) / 3);
                            obj.top = ((Rect) (obj)).bottom - k;
                            if (((Rect) (obj)).top < 0)
                            {
                                obj.top = 0;
                                obj.bottom = k;
                            }
                        }
                        if (j == 0)
                        {
                            break label1;
                        }
                    }
                    if (e.getWidth() * 10 > e.getHeight() * 24)
                    {
                        obj.left = (e.getWidth() - (e.getHeight() * 24) / 10) / 2;
                        obj.right = (e.getWidth() + (e.getHeight() * 24) / 10) / 2;
                    }
                }
                canvas.drawBitmap(e, ((Rect) (obj)), rect, f);
            }
label2:
            {
                if (c)
                {
                    if (a)
                    {
                        obj = ConversationRowImage.c();
                    } else
                    {
                        obj = ConversationRowImage.d();
                    }
                    if (j == 0)
                    {
                        break label2;
                    }
                }
                if (a)
                {
                    obj = ConversationRowImage.b();
                } else
                {
                    obj = com.whatsapp.ConversationRowImage.a();
                }
            }
            ((Drawable) (obj)).setBounds(rect);
            ((Drawable) (obj)).draw(canvas);
            f.setColor(0x33000000);
            f.setStrokeWidth(1.0F);
            f.setStyle(android.graphics.Paint.Style.STROKE);
        }

        protected void onMeasure(int i, int j)
        {
            int k;
            View view = ((Activity)getContext()).getWindow().getDecorView();
            k = (Math.min(view.getWidth(), view.getHeight()) * 70) / 100;
            j = (b * k) / g;
            i = j;
            if (j <= k) goto _L2; else goto _L1
_L1:
            if (App.am == 0) goto _L4; else goto _L3
_L3:
            i = k;
_L2:
            j = i;
            if (k * 10 > i * 24)
            {
                j = (k * 10) / 24;
            }
_L6:
            setMeasuredDimension(k, j);
            return;
_L4:
            j = k;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public RowImageView(Context context)
        {
            super(context);
            f = new Paint();
            a();
        }

        public RowImageView(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            f = new Paint();
            a();
        }

        public RowImageView(Context context, AttributeSet attributeset, int i)
        {
            super(context, attributeset, i);
            f = new Paint();
            a();
        }
    }

}
