// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.ubercab.client.feature.hiring.model.CodingChallenge;
import com.ubercab.client.feature.hiring.model.CodingQuestion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

final class ede
{

    private final Context a;
    private final Resources b;
    private CodingChallenge c;

    public ede(Context context)
    {
        a = context;
        b = context.getResources();
    }

    private String b()
    {
        BufferedReader bufferedreader;
        Object obj;
        bufferedreader = new BufferedReader(new InputStreamReader(a.getResources().openRawResource(0x7f060002)));
        obj = new StringBuffer();
_L1:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        ((StringBuffer) (obj)).append(s);
          goto _L1
        obj;
        ((IOException) (obj)).printStackTrace();
        throw new RuntimeException("Unable to load coding challenge questions resource.", ((Throwable) (obj)));
        obj;
        IOException ioexception;
        try
        {
            bufferedreader.close();
        }
        catch (IOException ioexception1)
        {
            ioexception1.printStackTrace();
            throw new RuntimeException("Unable to close challenge questions resource.", ioexception1);
        }
        throw obj;
        try
        {
            bufferedreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            throw new RuntimeException("Unable to close challenge questions resource.", ioexception);
        }
        return ((StringBuffer) (obj)).toString();
    }

    public final CodingChallenge a()
    {
        if (c != null)
        {
            return c;
        } else
        {
            c = CodingChallenge.create("goldenTicket", Arrays.asList(new CodingQuestion[] {
                CodingQuestion.create("q1", com.ubercab.client.feature.hiring.model.CodingQuestion.Type.TAP_LINE, b(), b.getStringArray(0x7f0c0012)), CodingQuestion.create("q2", com.ubercab.client.feature.hiring.model.CodingQuestion.Type.TAP_LINE, b(), b.getStringArray(0x7f0c0012)), CodingQuestion.create("q3", com.ubercab.client.feature.hiring.model.CodingQuestion.Type.TAP_LINE, b(), b.getStringArray(0x7f0c0014))
            }));
            return c;
        }
    }
}
