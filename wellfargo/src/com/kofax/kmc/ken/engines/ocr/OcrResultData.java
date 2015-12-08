// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.ocr;

import android.graphics.Rect;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.kofax.kmc.ken.engines.ocr:
//            OcrEngine, OcrWord

public class OcrResultData
{

    private static final String d = "OCR";
    String a;
    ErrorInfo b;
    String c;
    private ArrayList e;

    public OcrResultData()
    {
    }

    private void a()
    {
        if (e == null)
        {
            e = (ArrayList)OcrEngine.ocrWords().clone();
        }
    }

    public String getText()
    {
        a();
        if (e != null)
        {
            StringBuffer stringbuffer = new StringBuffer();
            OcrWord ocrword;
            for (Iterator iterator = e.iterator(); iterator.hasNext(); stringbuffer.append((new StringBuilder()).append(ocrword.getText()).append(" ").toString()))
            {
                ocrword = (OcrWord)iterator.next();
            }

            return stringbuffer.toString();
        } else
        {
            return null;
        }
    }

    public OcrWord getWordAtPoint(int i, int j)
    {
label0:
        {
            a();
            if (e == null)
            {
                break label0;
            }
            Iterator iterator = e.iterator();
            OcrWord ocrword;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                ocrword = (OcrWord)iterator.next();
            } while (!(new Rect(ocrword.getX(), ocrword.getY(), ocrword.getX() + ocrword.getWidth(), ocrword.getY() + ocrword.getHeight())).contains(i, j));
            return ocrword;
        }
        return null;
    }

    public ArrayList getWords()
    {
        a();
        return (ArrayList)e.clone();
    }

    public ArrayList getWordsinRect(int i, int j, int k, int l)
    {
        a();
        ArrayList arraylist = null;
        if (e != null)
        {
            arraylist = new ArrayList();
            Iterator iterator = e.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                OcrWord ocrword = (OcrWord)iterator.next();
                Rect rect = new Rect(ocrword.getX(), ocrword.getY(), ocrword.getWidth() + ocrword.getX(), ocrword.getHeight() + ocrword.getY());
                if ((new Rect(i, j, k, l)).intersect(rect))
                {
                    arraylist.add(ocrword);
                }
            } while (true);
        }
        return arraylist;
    }
}
