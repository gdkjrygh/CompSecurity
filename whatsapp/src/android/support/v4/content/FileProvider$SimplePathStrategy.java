// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

// Referenced classes of package android.support.v4.content:
//            Loader

class mAuthority
    implements mAuthority
{

    private static final String z[];
    private final String mAuthority;
    private final HashMap mRoots = new HashMap();

    public void addRoot(String s, File file)
    {
        try
        {
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalArgumentException(z[1]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        File file1;
        try
        {
            file1 = file.getCanonicalFile();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(z[0]).append(file).toString(), s);
        }
        mRoots.put(s, file1);
    }

    public File getFileForUri(Uri uri)
    {
        boolean flag = Loader.a;
        Object obj1 = uri.getEncodedPath();
        int i = ((String) (obj1)).indexOf('/', 1);
        Object obj = Uri.decode(((String) (obj1)).substring(1, i));
        obj1 = Uri.decode(((String) (obj1)).substring(i + 1));
        obj = (File)mRoots.get(obj);
        if (obj == null)
        {
            try
            {
                throw new IllegalArgumentException((new StringBuilder()).append(z[4]).append(uri).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        uri = new File(((File) (obj)), ((String) (obj1)));
        try
        {
            obj1 = uri.getCanonicalFile();
        }
        catch (IOException ioexception)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(z[2]).append(uri).toString());
        }
        try
        {
            if (!((File) (obj1)).getPath().startsWith(((File) (obj)).getPath()))
            {
                throw new SecurityException(z[3]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        try
        {
            i = Fragment.a;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            try
            {
                throw uri;
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        if (i != 0)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            Loader.a = flag;
        }
        return ((File) (obj1));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "QOL\030\ns\016Q\033OeKV\033\003aK\005\027\016yAK\035\fvB\005\004\016cF\005\022\000e\016";
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
                obj = "YOH\021Oz[V\000OyAQT\rr\016@\031\037cW";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "QOL\030\ns\016Q\033OeKV\033\003aK\005\027\016yAK\035\fvB\005\004\016cF\005\022\000e\016";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "EKV\033\003aKAT\037vZMT\005bCU\021\0137L@\r\000yJ\005\027\000yHL\023\032eKAT\035xAQ";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "B@D\026\003r\016Q\033OqGK\020OtAK\022\006p[W\021\0137\\J\033\0337HJ\006O";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 111;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 23;
          goto _L9
_L5:
        byte1 = 46;
          goto _L9
_L6:
        byte1 = 37;
          goto _L9
        byte1 = 116;
          goto _L9
    }

    public (String s)
    {
        mAuthority = s;
    }
}
