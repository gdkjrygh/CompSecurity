// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.cast.games.GameManagerState;
import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.cast.internal.zzc;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.cast.internal.zzp;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzjw, zzju, zzjy, zzjx, 
//            zzjt, zzjv

public class zzjs extends com.google.android.gms.cast.internal.zzc
{
    public abstract class zza extends zzb
    {

        final zzjs zzTB;

        public Result createFailedResult(Status status)
        {
            return zzo(status);
        }

        public com.google.android.gms.cast.games.GameManagerClient.GameManagerResult zzo(Status status)
        {
            return new zze(status, null, -1L, null);
        }

        public zza()
        {
            zzTB = zzjs.this;
            super();
            zzTa = new _cls1(this, zzjs.this);
        }
    }

    public abstract class zzb extends com.google.android.gms.cast.internal.zzb
    {

        final zzjs zzTB;
        protected zzo zzTa;

        public abstract void execute();

        protected void zza(com.google.android.gms.cast.internal.zze zze1)
        {
            execute();
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((com.google.android.gms.cast.internal.zze)client);
        }

        public zzo zzlA()
        {
            return zzTa;
        }

        public zzb()
        {
            zzTB = zzjs.this;
            super(zzjs.zzb(zzjs.this));
        }
    }

    public abstract class zzc extends zzb
    {

        final zzjs zzTB;
        private GameManagerClient zzTJ;

        static GameManagerClient zza(zzc zzc1)
        {
            return zzc1.zzTJ;
        }

        public Result createFailedResult(Status status)
        {
            return zzp(status);
        }

        public com.google.android.gms.cast.games.GameManagerClient.GameManagerInstanceResult zzp(Status status)
        {
            return new zzd(status, null);
        }

        public zzc(GameManagerClient gamemanagerclient)
        {
            zzTB = zzjs.this;
            super();
            zzTJ = gamemanagerclient;
            zzTa = new _cls1(this, zzjs.this);
        }
    }

    private static final class zzd
        implements com.google.android.gms.cast.games.GameManagerClient.GameManagerInstanceResult
    {

        private final Status zzOt;
        private final GameManagerClient zzTJ;

        public GameManagerClient getGameManagerClient()
        {
            return zzTJ;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        zzd(Status status, GameManagerClient gamemanagerclient)
        {
            zzOt = status;
            zzTJ = gamemanagerclient;
        }
    }

    private static final class zze
        implements com.google.android.gms.cast.games.GameManagerClient.GameManagerResult
    {

        private final Status zzOt;
        private final String zzTL;
        private final long zzTM;
        private final JSONObject zzTN;

        public JSONObject getExtraMessageData()
        {
            return zzTN;
        }

        public String getPlayerId()
        {
            return zzTL;
        }

        public long getRequestId()
        {
            return zzTM;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        zze(Status status, String s, long l, JSONObject jsonobject)
        {
            zzOt = status;
            zzTL = s;
            zzTM = l;
            zzTN = jsonobject;
        }
    }


    static final String NAMESPACE = zzf.zzbE("com.google.cast.games");
    private static final zzl zzQW = new zzl("GameManagerChannel");
    private String zzTA;
    private final Map zzTn = new ConcurrentHashMap();
    private final List zzTo;
    private final String zzTp;
    private final com.google.android.gms.cast.Cast.CastApi zzTq;
    private final GoogleApiClient zzTr;
    private zzjt zzTs;
    private boolean zzTt;
    private GameManagerState zzTu;
    private GameManagerState zzTv;
    private String zzTw;
    private JSONObject zzTx;
    private long zzTy;
    private com.google.android.gms.cast.games.GameManagerClient.Listener zzTz;
    private final SharedPreferences zztB;

    public zzjs(GoogleApiClient googleapiclient, String s, com.google.android.gms.cast.Cast.CastApi castapi)
        throws IllegalArgumentException, IllegalStateException
    {
        super(NAMESPACE, "CastGameManagerChannel", null);
        zzTt = false;
        zzTy = 0L;
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("castSessionId cannot be null.");
        }
        if (googleapiclient == null || !googleapiclient.isConnected() || !googleapiclient.hasConnectedApi(Cast.API))
        {
            throw new IllegalArgumentException("googleApiClient needs to be connected and contain the Cast.API API.");
        } else
        {
            zzTo = new ArrayList();
            zzTp = s;
            zzTq = castapi;
            zzTr = googleapiclient;
            googleapiclient = googleapiclient.getContext().getApplicationContext();
            s = String.format(Locale.ROOT, "%s.%s", new Object[] {
                googleapiclient.getPackageName(), "game_manager_channel_data"
            });
            zztB = googleapiclient.getApplicationContext().getSharedPreferences(s, 0);
            zzTv = null;
            zzTu = new zzjw(0, 0, "", null, new ArrayList(), "", -1);
            return;
        }
    }

    static zzjt zza(zzjs zzjs1, zzjt zzjt1)
    {
        zzjs1.zzTs = zzjt1;
        return zzjt1;
    }

    static String zza(zzjs zzjs1, String s)
    {
        zzjs1.zzTA = s;
        return s;
    }

    private JSONObject zza(long l, String s, int i, JSONObject jsonobject)
    {
        JSONObject jsonobject1;
        try
        {
            jsonobject1 = new JSONObject();
            jsonobject1.put("requestId", l);
            jsonobject1.put("type", i);
            jsonobject1.put("extraMessageData", jsonobject);
            jsonobject1.put("playerId", s);
            jsonobject1.put("playerToken", zzbA(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzQW.zzf("JSONException when trying to create a message: %s", new Object[] {
                s.getMessage()
            });
            return null;
        }
        return jsonobject1;
    }

    static void zza(zzjs zzjs1, String s, int i, JSONObject jsonobject, zzo zzo1)
    {
        zzjs1.zza(s, i, jsonobject, zzo1);
    }

    private void zza(zzju zzju1)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1;
        if (zzju1.zzlC() != 1)
        {
            flag = false;
        }
        zzTv = zzTu;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        if (zzju1.zzlH() != null)
        {
            zzTs = zzju1.zzlH();
        }
        flag1 = isInitialized();
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        obj = new ArrayList();
        zzjy zzjy1;
        String s;
        for (Iterator iterator = zzju1.zzlE().iterator(); iterator.hasNext(); ((ArrayList) (obj)).add(new zzjx(s, zzjy1.getPlayerState(), zzjy1.getPlayerData(), zzTn.containsKey(s))))
        {
            zzjy1 = (zzjy)iterator.next();
            s = zzjy1.getPlayerId();
        }

        break MISSING_BLOCK_LABEL_149;
        zzju1;
        throw zzju1;
        zzTu = new zzjw(zzju1.getLobbyState(), zzju1.getGameplayState(), zzju1.zzlF(), zzju1.getGameData(), ((java.util.Collection) (obj)), zzTs.zzlB(), zzTs.getMaxPlayers());
        obj = zzTu.getPlayer(zzju1.getPlayerId());
        if (obj == null) goto _L1; else goto _L3
_L3:
        if (!((PlayerInfo) (obj)).isControllable() || zzju1.zzlC() != 2) goto _L1; else goto _L4
_L4:
        zzTw = zzju1.getPlayerId();
        zzTx = zzju1.getExtraMessageData();
          goto _L1
    }

    private void zza(String s, int i, JSONObject jsonobject, zzo zzo1)
    {
        long l = 1L + zzTy;
        zzTy = l;
        s = zza(l, s, i, jsonobject);
        if (s == null)
        {
            zzo1.zza(-1L, 2001, null);
            zzQW.zzf("Not sending request because it was invalid.", new Object[0]);
            return;
        } else
        {
            jsonobject = new zzp(30000L);
            jsonobject.zza(l, zzo1);
            zzTo.add(jsonobject);
            zzQ(true);
            zzTq.sendMessage(zzTr, getNamespace(), s.toString()).setResultCallback(new ResultCallback(l) {

                final zzjs zzTB;
                final long zzTG;

                public void onResult(Result result)
                {
                    zzm((Status)result);
                }

                public void zzm(Status status)
                {
                    if (!status.isSuccess())
                    {
                        zzTB.zzb(zzTG, status.getStatusCode());
                    }
                }

            
            {
                zzTB = zzjs.this;
                zzTG = l;
                super();
            }
            });
            return;
        }
    }

    private int zzaI(int i)
    {
        byte byte0 = 0;
        switch (i)
        {
        default:
            zzQW.zzf((new StringBuilder()).append("Unknown GameManager protocol status code: ").append(i).toString(), new Object[0]);
            byte0 = 13;
            // fall through

        case 0: // '\0'
            return byte0;

        case 4: // '\004'
            return 2151;

        case 3: // '\003'
            return 2150;

        case 2: // '\002'
            return 2003;

        case 1: // '\001'
            return 2001;
        }
    }

    static GoogleApiClient zzb(zzjs zzjs1)
    {
        return zzjs1.zzTr;
    }

    private void zzb(long l, int i, Object obj)
    {
        Iterator iterator = zzTo.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((zzp)iterator.next()).zzc(l, i, obj))
            {
                iterator.remove();
            }
        } while (true);
    }

    static com.google.android.gms.cast.Cast.CastApi zzc(zzjs zzjs1)
    {
        return zzjs1.zzTq;
    }

    static void zzd(zzjs zzjs1)
    {
        zzjs1.zzly();
    }

    static void zze(zzjs zzjs1)
    {
        zzjs1.zzlx();
    }

    private void zzlv()
        throws IllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        if (!isInitialized())
        {
            throw new IllegalStateException("Attempted to perform an operation on the GameManagerChannel before it is initialized.");
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (isDisposed())
        {
            throw new IllegalStateException("Attempted to perform an operation on the GameManagerChannel after it has been disposed.");
        }
        this;
        JVM INSTR monitorexit ;
    }

    private void zzlw()
    {
        if (zzTz != null)
        {
            if (zzTv != null && !zzTu.equals(zzTv))
            {
                zzTz.onStateChanged(zzTu, zzTv);
            }
            if (zzTx != null && zzTw != null)
            {
                zzTz.onGameMessageReceived(zzTw, zzTx);
            }
        }
        zzTv = null;
        zzTw = null;
        zzTx = null;
    }

    private void zzlx()
    {
        this;
        JVM INSTR monitorenter ;
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("castSessionId", zzTp);
        jsonobject.put("playerTokenMap", new JSONObject(zzTn));
        zztB.edit().putString("save_data", jsonobject.toString()).commit();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        zzQW.zzf("Error while saving data: %s", new Object[] {
            ((JSONException) (obj)).getMessage()
        });
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    private void zzly()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = zztB.getString("save_data", null);
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        obj = new JSONObject(((String) (obj)));
        String s = ((JSONObject) (obj)).getString("castSessionId");
        if (zzTp.equals(s))
        {
            obj = ((JSONObject) (obj)).getJSONObject("playerTokenMap");
            String s1;
            for (Iterator iterator = ((JSONObject) (obj)).keys(); iterator.hasNext(); zzTn.put(s1, ((JSONObject) (obj)).getString(s1)))
            {
                s1 = (String)iterator.next();
            }

            break MISSING_BLOCK_LABEL_131;
        }
          goto _L1
        Object obj1;
        obj1;
        zzQW.zzf("Error while loading data: %s", new Object[] {
            ((JSONException) (obj1)).getMessage()
        });
          goto _L1
        obj1;
        throw obj1;
        zzTy = 0L;
          goto _L1
    }

    static zzl zzlz()
    {
        return zzQW;
    }

    public void dispose()
        throws IllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzTt;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzTu = null;
        zzTv = null;
        zzTw = null;
        zzTx = null;
        zzTt = true;
        zzTq.removeMessageReceivedCallbacks(zzTr, getNamespace());
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        zzQW.zzf("Exception while detaching game manager channel.", new Object[] {
            obj
        });
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public GameManagerState getCurrentState()
        throws IllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        GameManagerState gamemanagerstate;
        zzlv();
        gamemanagerstate = zzTu;
        this;
        JVM INSTR monitorexit ;
        return gamemanagerstate;
        Exception exception;
        exception;
        throw exception;
    }

    public String getLastUsedPlayerId()
        throws IllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        zzlv();
        s = zzTA;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isDisposed()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzTt;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isInitialized()
    {
        this;
        JVM INSTR monitorenter ;
        zzjt zzjt1 = zzTs;
        boolean flag;
        if (zzjt1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void sendGameMessage(String s, JSONObject jsonobject)
        throws IllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        zzlv();
        long l = 1L + zzTy;
        zzTy = l;
        s = zza(l, s, 7, jsonobject);
        if (s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzTq.sendMessage(zzTr, getNamespace(), s.toString());
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public PendingResult sendGameRequest(String s, JSONObject jsonobject)
        throws IllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        zzlv();
        s = zzTr.zzb(new zza(s, jsonobject) {

            final zzjs zzTB;
            final String zzTE;
            final JSONObject zzTF;

            public void execute()
            {
                zzjs.zza(zzTB, zzTE, 6, zzTF, zzlA());
            }

            
            {
                zzTB = zzjs.this;
                zzTE = s;
                zzTF = jsonobject;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public void setListener(com.google.android.gms.cast.games.GameManagerClient.Listener listener)
    {
        this;
        JVM INSTR monitorenter ;
        zzTz = listener;
        this;
        JVM INSTR monitorexit ;
        return;
        listener;
        throw listener;
    }

    public PendingResult zza(GameManagerClient gamemanagerclient)
        throws IllegalArgumentException
    {
        this;
        JVM INSTR monitorenter ;
        if (gamemanagerclient != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        throw new IllegalArgumentException("gameManagerClient can't be null.");
        gamemanagerclient;
        this;
        JVM INSTR monitorexit ;
        throw gamemanagerclient;
        gamemanagerclient = zzTr.zzb(new zzc(gamemanagerclient) {

            final zzjs zzTB;

            public void execute()
            {
                com.google.android.gms.internal.zzjs.zzc(zzTB).setMessageReceivedCallbacks(zzjs.zzb(zzTB), zzTB.getNamespace(), new com.google.android.gms.cast.Cast.MessageReceivedCallback(this) {

                    final _cls1 zzTC;

                    public void onMessageReceived(CastDevice castdevice, String s, String s1)
                    {
                        zzTC.zzTB.zzbB(s1);
                    }

            
            {
                zzTC = _pcls1;
                super();
            }
                });
                zzjs.zzd(zzTB);
                zzjs.zze(zzTB);
                zzjs.zza(zzTB, null, 1100, null, zzlA());
                return;
                Object obj;
                obj;
_L2:
                zzlA().zza(-1L, 8, null);
                return;
                obj;
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                zzTB = zzjs.this;
                super(gamemanagerclient);
            }
        });
        this;
        JVM INSTR monitorexit ;
        return gamemanagerclient;
    }

    public PendingResult zza(String s, int i, JSONObject jsonobject)
        throws IllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        zzlv();
        s = zzTr.zzb(new zza(i, s, jsonobject) {

            final zzjs zzTB;
            final int zzTD;
            final String zzTE;
            final JSONObject zzTF;

            public void execute()
            {
                int j = zzjv.zzaJ(zzTD);
                if (j == 0)
                {
                    zzlA().zza(-1L, 2001, null);
                    zzjs.zzlz().zzf("sendPlayerRequest for unsupported playerState: %d", new Object[] {
                        Integer.valueOf(zzTD)
                    });
                    return;
                } else
                {
                    zzjs.zza(zzTB, zzTE, j, zzTF, zzlA());
                    return;
                }
            }

            
            {
                zzTB = zzjs.this;
                zzTD = i;
                zzTE = s;
                zzTF = jsonobject;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public void zzb(long l, int i)
    {
        zzb(l, i, null);
    }

    public String zzbA(String s)
        throws IllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = (String)zzTn.get(s);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public final void zzbB(String s)
    {
        zzQW.zzb("message received: %s", new Object[] {
            s
        });
        Object obj;
        try
        {
            obj = zzju.zzh(new JSONObject(s));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzQW.zzf("Message is malformed (%s); ignoring: %s", new Object[] {
                ((JSONException) (obj)).getMessage(), s
            });
            return;
        }
        if (obj == null)
        {
            zzQW.zzf("Could not parse game manager message from string: %s", new Object[] {
                s
            });
        } else
        if ((isInitialized() || ((zzju) (obj)).zzlH() != null) && !isDisposed())
        {
            boolean flag;
            int i;
            if (((zzju) (obj)).zzlC() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && !TextUtils.isEmpty(((zzju) (obj)).zzlG()))
            {
                zzTn.put(((zzju) (obj)).getPlayerId(), ((zzju) (obj)).zzlG());
                zzlx();
            }
            if (((zzju) (obj)).getStatusCode() == 0)
            {
                zza(((zzju) (obj)));
            } else
            {
                zzQW.zzf("Not updating from game message because the message contains error code: %d", new Object[] {
                    Integer.valueOf(((zzju) (obj)).getStatusCode())
                });
            }
            i = zzaI(((zzju) (obj)).getStatusCode());
            if (flag)
            {
                zzb(((zzju) (obj)).getRequestId(), i, obj);
            }
            if (isInitialized() && i == 0)
            {
                zzlw();
                return;
            }
        }
    }

    protected boolean zzz(long l)
    {
        Iterator iterator = zzTo.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((zzp)iterator.next()).zzd(l, 15))
            {
                iterator.remove();
            }
        } while (true);
        Object obj = zzp.zzVr;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator1 = zzTo.iterator();
_L4:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        if (!((zzp)iterator1.next()).zzme()) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }


    // Unreferenced inner class com/google/android/gms/internal/zzjs$zza$1

/* anonymous class */
    class zza._cls1
        implements zzo
    {

        final zzjs zzTH;
        final zza zzTI;

        public void zza(long l, int i, Object obj)
        {
            if (obj == null)
            {
                String s;
                try
                {
                    zzTI.setResult(new zze(new Status(i, null, null), null, l, null));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    zzTI.setResult(zzTI.zzo(new Status(13)));
                }
                break MISSING_BLOCK_LABEL_135;
            }
            obj = (zzju)obj;
            s = ((zzju) (obj)).getPlayerId();
            if (i != 0 || s == null)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            zzjs.zza(zzTI.zzTB, s);
            zzTI.setResult(new zze(new Status(i, ((zzju) (obj)).zzlD(), null), s, ((zzju) (obj)).getRequestId(), ((zzju) (obj)).getExtraMessageData()));
            return;
        }

        public void zzy(long l)
        {
            zzTI.setResult(zzTI.zzo(new Status(2103)));
        }

            
            {
                zzTI = zza1;
                zzTH = zzjs1;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/internal/zzjs$zzc$1

/* anonymous class */
    class zzc._cls1
        implements zzo
    {

        final zzjs zzTH;
        final zzc zzTK;

        public void zza(long l, int i, Object obj)
        {
            if (obj == null)
            {
                zzjt zzjt1;
                try
                {
                    zzTK.setResult(new zzd(new Status(i, null, null), zzc.zza(zzTK)));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    zzTK.setResult(zzTK.zzp(new Status(13)));
                }
                break MISSING_BLOCK_LABEL_156;
            }
            obj = (zzju)obj;
            zzjt1 = ((zzju) (obj)).zzlH();
            if (zzjt1 == null)
            {
                break MISSING_BLOCK_LABEL_157;
            }
            if (!zzf.zza("1.0.0", zzjt1.getVersion()))
            {
                zzTK.setResult(zzTK.zzp(new Status(2150, String.format(Locale.ROOT, "Incorrect Game Manager SDK version. Receiver: %s Sender: %s", new Object[] {
                    zzjt1.getVersion(), "1.0.0"
                }))));
                zzjs.zza(zzTK.zzTB, null);
                return;
            }
            break MISSING_BLOCK_LABEL_157;
            return;
            zzTK.setResult(new zzd(new Status(i, ((zzju) (obj)).zzlD(), null), zzc.zza(zzTK)));
            return;
        }

        public void zzy(long l)
        {
            zzTK.setResult(zzTK.zzp(new Status(2103)));
        }

            
            {
                zzTK = zzc1;
                zzTH = zzjs1;
                super();
            }
    }

}
