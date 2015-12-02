// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.Fragment;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v4.content:
//            Loader

public class FileProvider extends ContentProvider
{

    private static final String COLUMNS[];
    private static final File DEVICE_ROOT;
    private static HashMap sCache;
    private static final String z[];
    private PathStrategy mStrategy;

    public FileProvider()
    {
    }

    private static File buildPath(File file, String as[])
    {
        boolean flag = Loader.a;
        int j = as.length;
        int i = 0;
        do
        {
            File file1;
label0:
            {
                file1 = file;
                if (i < j)
                {
                    String s = as[i];
                    file1 = file;
                    if (s != null)
                    {
                        file1 = new File(file, s);
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return file1;
            }
            i++;
            file = file1;
        } while (true);
    }

    private static Object[] copyOf(Object aobj[], int i)
    {
        Object aobj1[] = new Object[i];
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
        return aobj1;
    }

    private static String[] copyOf(String as[], int i)
    {
        String as1[] = new String[i];
        System.arraycopy(as, 0, as1, 0, i);
        return as1;
    }

    private static PathStrategy getPathStrategy(Context context, String s)
    {
        HashMap hashmap = sCache;
        hashmap;
        JVM INSTR monitorenter ;
        PathStrategy pathstrategy1 = (PathStrategy)sCache.get(s);
        PathStrategy pathstrategy;
        pathstrategy = pathstrategy1;
        if (pathstrategy1 != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        pathstrategy = parsePathStrategy(context, s);
        sCache.put(s, pathstrategy);
        hashmap;
        JVM INSTR monitorexit ;
        return pathstrategy;
        context;
        throw new IllegalArgumentException(z[10], context);
        context;
        hashmap;
        JVM INSTR monitorexit ;
        throw context;
        context;
        throw new IllegalArgumentException(z[9], context);
    }

    private static int modeToMode(String s)
    {
        int i;
label0:
        {
label1:
            {
                boolean flag = Loader.a;
                if ("r".equals(s))
                {
                    i = 0x10000000;
                    if (!flag)
                    {
                        break MISSING_BLOCK_LABEL_158;
                    }
                }
                boolean flag1;
                try
                {
                    if ("w".equals(s))
                    {
                        break label1;
                    }
                    flag1 = z[2].equals(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
                if (!flag1)
                {
                    break label0;
                }
            }
            i = 0x2c000000;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_158;
            }
        }
        try
        {
            flag1 = z[4].equals(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (flag1)
        {
            i = 0x2a000000;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_158;
            }
        }
        try
        {
            flag1 = z[3].equals(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (flag1)
        {
            i = 0x38000000;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_158;
            }
        }
        try
        {
            flag1 = z[1].equals(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (flag1)
        {
            i = 0x3c000000;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_158;
            }
        }
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append(z[5]).append(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        return i;
    }

    private static PathStrategy parsePathStrategy(Context context, String s)
    {
        boolean flag = Loader.a;
        SimplePathStrategy simplepathstrategy = new SimplePathStrategy(s);
        XmlResourceParser xmlresourceparser = context.getPackageManager().resolveContentProvider(s, 128).loadXmlMetaData(context.getPackageManager(), z[11]);
        if (xmlresourceparser == null)
        {
            try
            {
                throw new IllegalArgumentException(z[14]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
label0:
        do
        {
            int i;
            do
            {
                i = xmlresourceparser.next();
                if (i == 1)
                {
                    break label0;
                }
            } while (i != 2);
            s = xmlresourceparser.getName();
            String s1 = xmlresourceparser.getAttributeValue(null, z[12]);
            String s2 = xmlresourceparser.getAttributeValue(null, z[18]);
            if (z[16].equals(s))
            {
                s = buildPath(DEVICE_ROOT, new String[] {
                    s2
                });
            } else
            if (z[15].equals(s))
            {
                s = buildPath(context.getFilesDir(), new String[] {
                    s2
                });
            } else
            if (z[17].equals(s))
            {
                s = buildPath(context.getCacheDir(), new String[] {
                    s2
                });
            } else
            if (z[13].equals(s))
            {
                s = buildPath(Environment.getExternalStorageDirectory(), new String[] {
                    s2
                });
            } else
            {
                s = null;
            }
            if (s != null)
            {
                try
                {
                    simplepathstrategy.addRoot(s1, s);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context;
                }
            }
        } while (!flag);
        return simplepathstrategy;
    }

    public void attachInfo(Context context, ProviderInfo providerinfo)
    {
        try
        {
            super.attachInfo(context, providerinfo);
            if (providerinfo.exported)
            {
                throw new SecurityException(z[7]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        try
        {
            if (!providerinfo.grantUriPermissions)
            {
                throw new SecurityException(z[8]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        mStrategy = getPathStrategy(context, providerinfo.authority);
    }

    public int delete(Uri uri, String s, String as[])
    {
        uri = mStrategy.getFileForUri(uri);
        boolean flag;
        try
        {
            flag = uri.delete();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        return !flag ? 0 : 1;
    }

    public String getType(Uri uri)
    {
        uri = mStrategy.getFileForUri(uri);
        int i = uri.getName().lastIndexOf('.');
        if (i >= 0)
        {
            uri = uri.getName().substring(i + 1);
            uri = MimeTypeMap.getSingleton().getMimeTypeFromExtension(uri);
            if (uri != null)
            {
                return uri;
            }
        }
        return z[0];
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        throw new UnsupportedOperationException(z[23]);
    }

    public boolean onCreate()
    {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
    {
        return ParcelFileDescriptor.open(mStrategy.getFileForUri(uri), modeToMode(s));
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        int i;
        int k;
        int i1;
        boolean flag;
        i = 0;
        flag = Loader.a;
        s = mStrategy.getFileForUri(uri);
        uri = as;
        if (as == null)
        {
            uri = COLUMNS;
        }
        as1 = new String[uri.length];
        as = ((String []) (new Object[uri.length]));
        i1 = uri.length;
        k = 0;
_L5:
        int j = i;
        if (k >= i1) goto _L2; else goto _L1
_L1:
        s1 = uri[k];
        if (!z[22].equals(s1))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        as1[i] = z[20];
        int l = i + 1;
        try
        {
            as[i] = s.getName();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        j = l;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        Fragment.a++;
        i = l;
        j = i;
        if (!z[19].equals(s1))
        {
            break MISSING_BLOCK_LABEL_232;
        }
        as1[i] = z[21];
        j = i + 1;
        try
        {
            as[i] = Long.valueOf(s.length());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        i = j;
_L6:
        if (!flag) goto _L4; else goto _L3
_L3:
        j = i;
_L2:
        uri = copyOf(as1, j);
        as = ((String []) (copyOf(as, j)));
        uri = new MatrixCursor(uri, 1);
        uri.addRow(as);
        return uri;
_L4:
        k++;
          goto _L5
        i = j;
          goto _L6
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException(z[6]);
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int i;
        as = new String[24];
        obj = "T\007F:[V\026B?][XY5FP\003\033%FG\022W;";
        byte0 = -1;
        as1 = as;
        i = 0;
_L10:
        int j;
        int k;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L7:
        if (k <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            char c;
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "G\000B";
                i = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "B\003";
                i = 2;
                as1 = as;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "G\0";
                i = 3;
                as1 = as;
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "B\026";
                i = 4;
                as1 = as;
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                as1 = as;
                obj = "|\031@7^\\\023\026;]Q\022\fv";
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "{\030\0263JA\022D8SYWC&VT\003S%";
                byte0 = 5;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "e\005Y [Q\022Dv_@\004Bv\\Z\003\0264W\025\022N&]G\003S2";
                byte0 = 6;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "e\005Y [Q\022Dv_@\004BvUG\026X\"\022@\005_vBP\005[?AF\036Y8A";
                byte0 = 7;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "s\026_:WQWB9\022E\026D%W\025\026X2@Z\036RxA@\007F9@AYp\037~p(f\004}c>r\023`j'w\002zfW[3FTZR7FT";
                byte0 = 8;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "s\026_:WQWB9\022E\026D%W\025\026X2@Z\036RxA@\007F9@AYp\037~p(f\004}c>r\023`j'w\002zfW[3FTZR7FT";
                byte0 = 9;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "T\031R$]\\\023\030%GE\007Y$F\0331\177\032wj'd\031d|3s\004me6b\036a";
                byte0 = 10;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "[\026[3";
                byte0 = 11;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "P\017B3@[\026Z{BT\003^";
                byte0 = 12;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "x\036E%[[\020\0267\\Q\005Y?V\033\004C&BZ\005Bxt|;s\tbg8`\037vp%i\006sa?ev_P\003W{VT\003W";
                byte0 = 13;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "S\036Z3A\030\007W\"Z";
                byte0 = 14;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "G\030Y\"\037E\026B>";
                byte0 = 15;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "V\026U>W\030\007W\"Z";
                byte0 = 16;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "E\026B>";
                byte0 = 17;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "j\004_,W";
                byte0 = 18;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "j\023_%BY\026O\t\\T\032S";
                byte0 = 19;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "j\004_,W";
                byte0 = 20;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "j\023_%BY\026O\t\\T\032S";
                byte0 = 21;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "{\030\0263JA\022D8SYW_8AP\005B%";
                byte0 = 22;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 22: // '\026'
                as1[i] = ((String) (obj));
                z = as;
                as = new String[2];
                obj = "j\023_%BY\026O\t\\T\032S";
                byte0 = 23;
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 23: // '\027'
                as1[i] = ((String) (obj));
                obj = "j\004_,W";
                byte0 = 24;
                i = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 24: // '\030'
                as1[i] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 680
    //                   0 703
    //                   1 710
    //                   2 717
    //                   3 724;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_724;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 50;
_L8:
        obj[j] = (char)(byte1 ^ c);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 53;
          goto _L8
_L3:
        byte1 = 119;
          goto _L8
_L4:
        byte1 = 54;
          goto _L8
        byte1 = 86;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        COLUMNS = as;
        DEVICE_ROOT = new File("/");
        sCache = new HashMap();
    }

    private class PathStrategy
    {

        public abstract File getFileForUri(Uri uri);
    }


    private class SimplePathStrategy
        implements PathStrategy
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
        //                       0 215
        //                       1 222
        //                       2 229
        //                       3 236;
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

        public SimplePathStrategy(String s)
        {
            mAuthority = s;
        }
    }

}
