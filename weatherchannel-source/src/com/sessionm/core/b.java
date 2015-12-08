// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.sessionm.a.a;
import com.sessionm.net.http.DownloadService;
import com.sessionm.ui.SessionMVideoView;
import com.sessionm.ui.VideoErrorListener;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

// Referenced classes of package com.sessionm.core:
//            Session, c, h

public class b
    implements com.sessionm.net.http.b, VideoErrorListener
{

    public static final String DATA = "data";
    public static final String SIZE = "size";
    public static final String STATUS = "status";
    private static final String TAG = "SessionM.FileCache";
    public static final String TYPE = "type";
    public static final String URL = "url";
    public static final String bW = "md5";
    private static final String bX = "sm_cached_files";
    private static final String bY = "com.sessionm.filecache.prefs.file";
    private static final String bZ = "com.sessionm.filecache.prefs.urls.file";
    private static final String ca = "com.sessionm.filecache.enabled.key";
    private static final String cb = "smdownload";
    private static final String cc = "SHA-1";
    private static final String cd = "ad";
    public static final String ce = "achievement";
    private Context cf;
    private boolean cg;
    private c ch;
    private boolean ci;
    private final List cj = new ArrayList();
    private ExecutorService ck;

    public b(Context context, ExecutorService executorservice)
    {
        ci = false;
        cf = context.getApplicationContext();
        ck = executorservice;
        DownloadService.setListener(this);
        c(cf.getSharedPreferences("com.sessionm.filecache.prefs.file", 0).getBoolean("com.sessionm.filecache.enabled.key", false));
    }

    static Context a(b b1)
    {
        return b1.cf;
    }

    static List b(b b1)
    {
        return b1.cj;
    }

    static void c(b b1)
    {
        b1.m();
    }

    private File d(String s)
    {
        if (s == null || TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return new File(f(cf), f(s));
        }
    }

    private File e(String s)
    {
        s = String.format(Locale.US, "%s.%s", new Object[] {
            f(s), "smdownload"
        });
        return new File(f(cf), s);
    }

    private File f(Context context)
    {
        if (ci)
        {
            return new File(Environment.getExternalStorageDirectory(), "sm_cached_files");
        } else
        {
            return new File(context.getCacheDir(), "sm_cached_files");
        }
    }

    private String f(String s)
    {
        return com.sessionm.a.a.d(s, "SHA-1");
    }

    private void m()
    {
        Iterator iterator = cj.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        obj = (com.sessionm.b.a)iterator.next();
        i = ((com.sessionm.b.a) (obj)).getInt("status");
        obj = ((com.sessionm.b.a) (obj)).getString("type");
        if (obj == null || !((String) (obj)).equals("achievement") || i == 1) goto _L4; else goto _L3
_L3:
        if (Log.isLoggable("SessionM.FileCache", 3))
        {
            Log.d("SessionM.FileCache", String.format(Locale.US, "Achievement loaded with error: %s", new Object[] {
                Integer.valueOf(i)
            }));
        }
_L6:
        return;
_L2:
        if (Log.isLoggable("SessionM.FileCache", 3))
        {
            Log.d("SessionM.FileCache", "All achievements are successfully loaded. Notifying cache listeners.");
        }
        Session.D().ap();
        if (ch != null)
        {
            ch.e(this);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void r()
    {
        ck.execute(new Runnable() {

            final b cl;

            public void run()
            {
                android.content.SharedPreferences.Editor editor = com.sessionm.core.b.a(cl).getSharedPreferences("com.sessionm.filecache.prefs.urls.file", 0).edit();
                editor.clear();
                editor.commit();
                com.sessionm.b.a a1;
                for (Iterator iterator = b.b(cl).iterator(); iterator.hasNext(); editor.putString(a1.getString("url"), a1.aL().toString()))
                {
                    a1 = (com.sessionm.b.a)iterator.next();
                }

                editor.commit();
                if (b.b(cl).size() > 0)
                {
                    b.c(cl);
                }
            }

            
            {
                cl = b.this;
                super();
            }
        });
    }

    public void a(c c1)
    {
        ch = c1;
    }

    public void a(DownloadService downloadservice, String s, int i)
    {
        this;
        JVM INSTR monitorenter ;
        a(s, i);
        if (i != 1) goto _L2; else goto _L1
_L1:
        downloadservice = d(s);
        if (!e(s).renameTo(downloadservice))
        {
            c(true);
        }
_L4:
        if (ch != null)
        {
            ch.d(this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (i != 7) goto _L4; else goto _L3
_L3:
        c(true);
          goto _L4
        downloadservice;
        throw downloadservice;
    }

    public void a(String s, int i)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = cg;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (Log.isLoggable("SessionM.FileCache", 3))
        {
            Log.d("SessionM.FileCache", String.format(Locale.US, "Setting url status code %s: %s", new Object[] {
                Integer.valueOf(i), s
            }));
        }
        if (i == 1)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        File file = d(s);
        if (file.exists() && !file.delete())
        {
            c(true);
        }
        Iterator iterator = cj.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.sessionm.b.a a1 = (com.sessionm.b.a)iterator.next();
            if (a1.getString("url").equals(s))
            {
                a1.put("status", i);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_145;
        s;
        throw s;
        r();
          goto _L1
    }

    public void a(com.sessionm.b.a aa[])
    {
        this;
        JVM INSTR monitorenter ;
        if (aa == null) goto _L2; else goto _L1
_L1:
        if (aa.length != 0) goto _L3; else goto _L2
_L2:
        o();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        File file;
        file = f(cf);
        if (file.exists() || file.mkdirs())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        c(true);
          goto _L4
        aa;
        throw aa;
label0:
        {
            if (file.isDirectory())
            {
                break label0;
            }
            c(true);
        }
          goto _L4
        File afile[];
        int j1;
        afile = file.listFiles();
        j1 = afile.length;
        int j = 0;
_L8:
        if (j >= j1) goto _L6; else goto _L5
_L5:
        File file1 = afile[j];
        String s1;
        int k1;
        s1 = file1.getName();
        k1 = aa.length;
        int k;
        int i1;
        k = 0;
        i1 = 1;
_L7:
        if (k >= k1)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        String s3 = f(aa[k].getString("url"));
        int i;
        if (s3.equals(s1))
        {
            i = 0;
            break MISSING_BLOCK_LABEL_388;
        }
        i = i1;
        if (!s1.startsWith(s3))
        {
            break MISSING_BLOCK_LABEL_388;
        }
        i = i1;
        if (s1.endsWith("smdownload"))
        {
            i = 0;
        }
        break MISSING_BLOCK_LABEL_388;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        if (Log.isLoggable("SessionM.FileCache", 3))
        {
            Log.d("SessionM.FileCache", String.format(Locale.US, "Discarding file not in url list: %s", new Object[] {
                s1
            }));
        }
        if (file1.delete())
        {
            break MISSING_BLOCK_LABEL_401;
        }
        c(true);
          goto _L4
_L6:
        j = aa.length;
        String s;
        com.sessionm.b.a a1;
        String s2;
        String s4;
        for (i = 0; i >= j; i++)
        {
            break MISSING_BLOCK_LABEL_381;
        }

        a1 = aa[i];
        s2 = a1.getString("url");
        s4 = a1.getString("md5");
        s = null;
        if (s4 != null)
        {
            s = "MD5";
        }
        k = a1.getInt("size");
        if (!b(s2))
        {
            a1.put("status", 0);
            cj.add(a1);
            DownloadService.start(cf, s2, e(s2).getAbsolutePath(), s4, s, k);
            if (ch != null)
            {
                ch.a(this, s2);
            }
            break MISSING_BLOCK_LABEL_410;
        }
        a1.put("status", 1);
        cj.add(a1);
        break MISSING_BLOCK_LABEL_410;
        r();
          goto _L4
        k++;
        i1 = i;
          goto _L7
        j++;
          goto _L8
    }

    public boolean b(String s)
    {
        if (s != null && !TextUtils.isEmpty(s))
        {
            s = d(s);
            if (!l() && s != null && s.exists())
            {
                return true;
            }
        }
        return false;
    }

    public Uri c(String s)
    {
        if (d(s) == null)
        {
            return null;
        } else
        {
            return Uri.fromFile(d(s));
        }
    }

    public void c(boolean flag)
    {
        if (cg == flag)
        {
            return;
        }
        cg = flag;
        android.content.SharedPreferences.Editor editor;
        if (cg)
        {
            DownloadService.setListener(null);
            cj.clear();
            r();
        } else
        {
            DownloadService.setListener(this);
        }
        editor = cf.getSharedPreferences("com.sessionm.filecache.prefs.file", 0).edit();
        editor.putBoolean("com.sessionm.filecache.enabled.key", flag);
        editor.commit();
    }

    public boolean d(int i)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b(f(i).getString("url"));
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public String e(int i)
    {
        this;
        JVM INSTR monitorenter ;
        String s = null;
        com.sessionm.b.a a1 = f(i);
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        s = g(a1.getString("url"));
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public com.sessionm.b.a f(int i)
    {
        for (Iterator iterator = cj.iterator(); iterator.hasNext();)
        {
            com.sessionm.b.a a1 = (com.sessionm.b.a)iterator.next();
            if (a1.getInt("id") == i)
            {
                return a1;
            }
        }

        return null;
    }

    public String g(String s)
    {
        s = d(s);
        if (s == null)
        {
            return null;
        }
        ByteArrayOutputStream bytearrayoutputstream;
        try
        {
            s = new BufferedInputStream(new FileInputStream(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            com.sessionm.core.h.a(s, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return bytearrayoutputstream.toString();
    }

    public boolean l()
    {
        return cg;
    }

    public com.sessionm.b.a n()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = cj.iterator();
        int i = 0;
_L8:
        Object obj;
        String s;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_120;
        }
        obj = (com.sessionm.b.a)((Iterator) (obj1)).next();
        s = ((com.sessionm.b.a) (obj)).getString("type");
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!s.equalsIgnoreCase("ad") || ((com.sessionm.b.a) (obj)).getInt("status") != 1) goto _L2; else goto _L3
_L3:
        obj1 = obj;
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (!b(((com.sessionm.b.a) (obj)).getString("url"))) goto _L7; else goto _L6
_L6:
        cj.remove(i);
        obj1 = obj;
_L5:
        this;
        JVM INSTR monitorexit ;
        return ((com.sessionm.b.a) (obj1));
_L2:
        i++;
          goto _L8
_L7:
        obj1 = null;
          goto _L5
        obj;
        throw obj;
        obj = null;
          goto _L3
    }

    public void o()
    {
        this;
        JVM INSTR monitorenter ;
        c(false);
        ci = false;
        com.sessionm.core.h.a(f(cf));
        android.content.SharedPreferences.Editor editor = cf.getSharedPreferences("com.sessionm.filecache.prefs.file", 0).edit();
        editor.clear();
        editor.commit();
        cj.clear();
        r();
        if (ch != null)
        {
            ch.d(this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean onVideoError(SessionMVideoView sessionmvideoview, int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        a(sessionmvideoview.getUrl(), 3);
        if (ch != null)
        {
            ch.d(this);
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        sessionmvideoview;
        throw sessionmvideoview;
    }

    public com.sessionm.b.a[] p()
    {
        this;
        JVM INSTR monitorenter ;
        com.sessionm.b.a aa[] = (com.sessionm.b.a[])cj.toArray(new com.sessionm.b.a[0]);
        this;
        JVM INSTR monitorexit ;
        return aa;
        Exception exception;
        exception;
        throw exception;
    }

    com.sessionm.b.a[] q()
    {
        SharedPreferences sharedpreferences = cf.getSharedPreferences("com.sessionm.filecache.prefs.urls.file", 0);
        ArrayList arraylist = new ArrayList();
        Iterator iterator = sharedpreferences.getAll().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = sharedpreferences.getString((String)iterator.next(), null);
            if (obj != null)
            {
                obj = com.sessionm.b.a.A(((String) (obj)));
                if (obj != null)
                {
                    arraylist.add(obj);
                }
            }
        } while (true);
        return (com.sessionm.b.a[])arraylist.toArray(new com.sessionm.b.a[arraylist.size()]);
    }

    public int size()
    {
        int i;
        int k;
        i = 0;
        k = 0;
        if (!l()) goto _L2; else goto _L1
_L1:
        int j = k;
_L4:
        return j;
_L2:
        File file = f(cf);
        j = k;
        if (!file.exists())
        {
            continue;
        }
        j = k;
        if (file.listFiles() == null)
        {
            continue;
        }
        File afile[] = file.listFiles();
        int i1 = afile.length;
        k = 0;
        do
        {
            j = i;
            if (k >= i1)
            {
                continue;
            }
            File file1 = afile[k];
            i = (int)((long)i + file1.length());
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
