// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.sessionm.api.AchievementData;
import com.sessionm.api.SessionListener;
import com.sessionm.api.SessionM;
import com.sessionm.api.User;
import com.sessionm.b.a;
import com.sessionm.net.Request;
import com.sessionm.net.RequestQueue;
import com.sessionm.net.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.sessionm.core:
//            Session, AchievementImpl, d

public class g
    implements User
{
    public static interface a
    {

        public abstract void onOptInFailed();

        public abstract void onOptInSucceeded();
    }


    private static final String eU = "com.sessionm.user.user_state";
    private static final String fe = "point_balance";
    private static final String ff = "opted_out";
    private static final String fg = "registered";
    private static final String fh = "logged_in";
    private static final String fi = "unclaimed_achievement_count";
    private static final String fj = "unclaimed_achievement_value";
    private static final String fk = "achievements";
    private com.sessionm.b.a eV;
    private int eW;
    private boolean eX;
    private boolean eY;
    private boolean eZ;
    private boolean fa;
    private boolean fb;
    private int fc;
    private int fd;
    private List fl;
    private List fm;

    g()
    {
        fl = new ArrayList();
        fm = new ArrayList();
        fa = true;
        fb = false;
        aC();
    }

    g(g g1)
    {
        fl = new ArrayList();
        fm = new ArrayList();
        eX = g1.eX;
        eY = g1.eY;
        eZ = g1.eZ;
        eW = g1.eW;
        fc = g1.fc;
        fd = g1.fd;
        eV = g1.eV;
        fl = new ArrayList();
        fl.addAll(g1.fl);
        fm = new ArrayList();
        fl.addAll(g1.fm);
    }

    static void a(g g1)
    {
        g1.aD();
    }

    private void aC()
    {
        fl.clear();
        fm.clear();
        Object obj = Session.D().getApplicationContext();
        if (obj != null)
        {
            obj = ((Context) (obj)).getSharedPreferences("com.sessionm.user.user_state", 0);
            eW = ((SharedPreferences) (obj)).getInt("point_balance", 0);
            fc = ((SharedPreferences) (obj)).getInt("unclaimed_achievement_count", 0);
            fd = ((SharedPreferences) (obj)).getInt("unclaimed_achievement_value", 0);
            eX = ((SharedPreferences) (obj)).getBoolean("opted_out", false);
            eY = ((SharedPreferences) (obj)).getBoolean("registered", false);
            eZ = ((SharedPreferences) (obj)).getBoolean("logged_in", false);
        }
    }

    private void aD()
    {
        Object obj = Session.D().getApplicationContext();
        if (obj == null)
        {
            return;
        }
        obj = ((Context) (obj)).getSharedPreferences("com.sessionm.user.user_state", 0);
        if (obj != null)
        {
            try
            {
                obj = ((SharedPreferences) (obj)).edit();
                ((android.content.SharedPreferences.Editor) (obj)).putInt("point_balance", eW);
                ((android.content.SharedPreferences.Editor) (obj)).putInt("unclaimed_achievement_count", fc);
                ((android.content.SharedPreferences.Editor) (obj)).putInt("unclaimed_achievement_value", fd);
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("opted_out", eX);
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("registered", eY);
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("logged_in", eZ);
                ((android.content.SharedPreferences.Editor) (obj)).commit();
                return;
            }
            catch (Exception exception)
            {
                if (Log.isLoggable("SessionM", 6))
                {
                    Log.e("SessionM", "Exception persisting user", exception);
                }
            }
        }
        return;
    }

    public void a(Context context, boolean flag, a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (flag != eX) goto _L2; else goto _L1
_L1:
        boolean flag1 = fb;
        if (flag1) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        eX = flag;
        final Session session = Session.D();
        if (session.getSessionState() != com.sessionm.api.SessionM.State.STARTED_ONLINE)
        {
            fb = true;
        }
        session.getExecutorService().execute(new Runnable(a1, flag, context) {

            final Context dS;
            final a fn;
            final boolean fo;
            final g fp;
            final Session val$session;

            public void run()
            {
                Session session1 = session;
                session1;
                JVM INSTR monitorenter ;
                if (fp.isOptedOut())
                {
                    session.as().g(session.getApplicationContext());
                }
                com.sessionm.core.g.a(fp);
                if (session.getSessionState() != com.sessionm.api.SessionM.State.STOPPED) goto _L2; else goto _L1
_L1:
                session.a(new SessionListener(this) {

                    final _cls1 fq;

                    public void onSessionFailed(SessionM sessionm, int i)
                    {
                        if (fq.fn != null)
                        {
                            fq.fn.onOptInFailed();
                        }
                        fq.session.b(this);
                    }

                    public void onSessionStateChanged(SessionM sessionm, com.sessionm.api.SessionM.State state)
                    {
                        if (fq.fn != null && state.isStarted())
                        {
                            if (state == com.sessionm.api.SessionM.State.STARTED_ONLINE && fq.session.C().isOptedOut() == fq.fo)
                            {
                                fq.fn.onOptInSucceeded();
                            } else
                            {
                                fq.fn.onOptInFailed();
                            }
                            fq.session.b(this);
                        }
                    }

                    public void onUnclaimedAchievement(SessionM sessionm, AchievementData achievementdata)
                    {
                    }

                    public void onUserUpdated(SessionM sessionm, User user)
                    {
                    }

            
            {
                fq = _pcls1;
                super();
            }
                });
                if (!session.b(dS, session.E()) && fn != null)
                {
                    fn.onOptInFailed();
                }
_L3:
                return;
_L2:
                Object obj1 = com.sessionm.b.a.aJ();
                Object obj;
                if (fo)
                {
                    obj = "1";
                } else
                {
                    obj = "0";
                }
                ((com.sessionm.b.a) (obj1)).put("member[opted_out]", ((String) (obj)));
                obj = new Request(com.sessionm.net.Request.Type.gW);
                ((Request) (obj)).d(((com.sessionm.b.a) (obj1)));
                obj1 = session.N();
                ((RequestQueue) (obj1)).a(((Request) (obj)), new c(this) {

                    final _cls1 fq;

                    public void onReplyReceived(Request request)
                    {
                        if (request.bd() == com.sessionm.net.Request.State.gI)
                        {
                            if (fq.fn != null)
                            {
                                fq.fn.onOptInSucceeded();
                            }
                        } else
                        if (fq.fn != null)
                        {
                            fq.fn.onOptInFailed();
                            return;
                        }
                    }

            
            {
                fq = _pcls1;
                super();
            }
                });
                ((RequestQueue) (obj1)).e(((Request) (obj)));
                  goto _L3
                obj;
                session1;
                JVM INSTR monitorexit ;
                throw obj;
            }

            
            {
                fp = g.this;
                session = session1;
                fn = a1;
                fo = flag;
                dS = context;
                super();
            }
        });
        if (true) goto _L3; else goto _L4
_L4:
        context;
        throw context;
    }

    boolean c(com.sessionm.b.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1 == null) goto _L2; else goto _L1
_L1:
        eV = a1;
        if (!a1.has("point_balance")) goto _L4; else goto _L3
_L3:
        int i = a1.getInt("point_balance");
        if (i == eW) goto _L4; else goto _L5
_L5:
        eW = i;
        boolean flag2 = true;
_L10:
        if (a1.has("opted_out"))
        {
            boolean flag = a1.getBoolean("opted_out");
            if (flag != eX && !fb)
            {
                eX = flag;
            }
            if (fb)
            {
                setOptedOut(Session.D().getApplicationContext(), eX);
                fb = false;
            }
            break MISSING_BLOCK_LABEL_480;
        }
_L11:
        boolean flag1 = flag2;
        boolean flag3;
        if (!a1.has("registered"))
        {
            break MISSING_BLOCK_LABEL_157;
        }
        flag3 = a1.getBoolean("registered");
        flag1 = flag2;
        if (flag3 == eY)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        eY = flag3;
        flag1 = true;
        flag2 = flag1;
        if (!a1.has("logged_in"))
        {
            break MISSING_BLOCK_LABEL_200;
        }
        flag3 = a1.getBoolean("logged_in");
        flag2 = flag1;
        if (flag3 == eZ)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        eZ = flag3;
        flag2 = true;
        flag1 = flag2;
        if (!a1.has("unclaimed_achievement_count"))
        {
            break MISSING_BLOCK_LABEL_243;
        }
        i = a1.getInt("unclaimed_achievement_count");
        flag1 = flag2;
        if (i == fc)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        fc = i;
        flag1 = true;
        flag2 = flag1;
        if (!a1.has("unclaimed_achievement_value"))
        {
            break MISSING_BLOCK_LABEL_286;
        }
        i = a1.getInt("unclaimed_achievement_value");
        flag2 = flag1;
        if (i == fd)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        fd = i;
        flag2 = true;
        ArrayList arraylist;
        if (!a1.has("achievements"))
        {
            break MISSING_BLOCK_LABEL_406;
        }
        a1 = (JSONArray)a1.D("achievements");
        arraylist = new ArrayList();
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        i = 0;
_L6:
        int j = a1.length();
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        arraylist.add(new AchievementImpl(com.sessionm.b.a.A(a1.getJSONObject(i).toString()), "list"));
_L8:
        i++;
          goto _L6
        JSONException jsonexception;
        jsonexception;
        if (!Log.isLoggable("SessionM", 6)) goto _L8; else goto _L7
_L7:
        Log.e("SessionM", "Exception getting achievements list. ", jsonexception);
          goto _L8
        a1;
        throw a1;
        fm = arraylist;
        flag2 = true;
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_422;
        }
        flag1 = flag2;
        if (!fa)
        {
            break MISSING_BLOCK_LABEL_440;
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_431;
        }
        aD();
        fa = false;
        flag1 = flag2;
_L9:
        this;
        JVM INSTR monitorexit ;
        return flag1;
_L2:
        fa = true;
        fl.clear();
        fm.clear();
        flag1 = false;
        if (true) goto _L9; else goto _L4
_L4:
        flag2 = false;
          goto _L10
        flag2 = true;
          goto _L11
    }

    public void clear()
    {
        Object obj = Session.D().getApplicationContext();
        if (obj == null)
        {
            return;
        }
        obj = ((Context) (obj)).getSharedPreferences("com.sessionm.user.user_state", 0);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        obj = ((SharedPreferences) (obj)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).clear();
        ((android.content.SharedPreferences.Editor) (obj)).commit();
_L2:
        aC();
        return;
        Exception exception;
        exception;
        if (Log.isLoggable("SessionM", 6))
        {
            Log.e("SessionM", "Exception clearing user", exception);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public List getAchievements()
    {
        return fl;
    }

    public List getAchievementsList()
    {
        return fm;
    }

    public int getPointBalance()
    {
        this;
        JVM INSTR monitorenter ;
        int i = eW;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public int getUnclaimedAchievementCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = fc;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public int getUnclaimedAchievementValue()
    {
        this;
        JVM INSTR monitorenter ;
        int i = fd;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public Object getValueForKey(String s)
    {
        this;
        JVM INSTR monitorenter ;
        com.sessionm.b.a a1 = eV;
        if (a1 != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = ((String) (eV.getObject(s)));
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public boolean isLoggedIn()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = eZ;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isOptedOut()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = eX;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isRegistered()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = eY;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public AchievementImpl l(String s)
    {
        for (Iterator iterator = fl.iterator(); iterator.hasNext();)
        {
            AchievementData achievementdata = (AchievementData)iterator.next();
            if (achievementdata.getAchievementId().equals(s))
            {
                return (AchievementImpl)achievementdata;
            }
        }

        return null;
    }

    public void setOptedOut(Context context, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(context, flag, null);
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public String toJSON()
    {
        this;
        JVM INSTR monitorenter ;
        String s = eV.toString();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String toString()
    {
        this;
        JVM INSTR monitorenter ;
        String s = String.format(Locale.US, "<User point balance: %d unclaimed achievement count: %d unclaimed achievement value: %d opted_out: %b", new Object[] {
            Integer.valueOf(eW), Integer.valueOf(fc), Integer.valueOf(fd), Boolean.valueOf(eX)
        });
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
