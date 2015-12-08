// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;

import com.contextlogic.wish.WishApplication;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class StateSerializer
{
    public static final class SerializationType extends Enum
    {

        private static final SerializationType $VALUES[];
        public static final SerializationType Follower;
        public static final SerializationType Profile;
        public static final SerializationType Session;
        public static final SerializationType Status;

        public static SerializationType valueOf(String s)
        {
            return (SerializationType)Enum.valueOf(com/contextlogic/wish/util/StateSerializer$SerializationType, s);
        }

        public static SerializationType[] values()
        {
            return (SerializationType[])$VALUES.clone();
        }

        static 
        {
            Profile = new SerializationType("Profile", 0);
            Follower = new SerializationType("Follower", 1);
            Session = new SerializationType("Session", 2);
            Status = new SerializationType("Status", 3);
            $VALUES = (new SerializationType[] {
                Profile, Follower, Session, Status
            });
        }

        private SerializationType(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String FOLLOWER_SERIALIZATION_FILENAME = "serialized_following";
    public static final String PROFILE_SERIALIZATION_FILENAME = "serialized_profile";
    public static final String SESSION_SERIALIZATION_FILENAME = "serialized_session";
    public static final String STATUS_SERIALIZATION_FILENAME = "serialized_status";
    private static StateSerializer _instance = new StateSerializer();
    private ExecutorService cleanupThreadPool;
    private ExecutorService followerSerializerThreadPool;
    private ExecutorService profileSerializerThreadPool;
    private ExecutorService sessionSerializerThreadPool;
    private ExecutorService statusSerializerThreadPool;

    private StateSerializer()
    {
        profileSerializerThreadPool = Executors.newFixedThreadPool(1, new ThreadFactory() {

            final StateSerializer this$0;

            public Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable);
                runnable.setPriority(1);
                return runnable;
            }

            
            {
                this$0 = StateSerializer.this;
                super();
            }
        });
        followerSerializerThreadPool = Executors.newFixedThreadPool(1, new ThreadFactory() {

            final StateSerializer this$0;

            public Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable);
                runnable.setPriority(1);
                return runnable;
            }

            
            {
                this$0 = StateSerializer.this;
                super();
            }
        });
        sessionSerializerThreadPool = Executors.newFixedThreadPool(1, new ThreadFactory() {

            final StateSerializer this$0;

            public Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable);
                runnable.setPriority(1);
                return runnable;
            }

            
            {
                this$0 = StateSerializer.this;
                super();
            }
        });
        statusSerializerThreadPool = Executors.newFixedThreadPool(1, new ThreadFactory() {

            final StateSerializer this$0;

            public Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable);
                runnable.setPriority(1);
                return runnable;
            }

            
            {
                this$0 = StateSerializer.this;
                super();
            }
        });
        cleanupThreadPool = Executors.newFixedThreadPool(1, new ThreadFactory() {

            final StateSerializer this$0;

            public Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable);
                runnable.setPriority(2);
                return runnable;
            }

            
            {
                this$0 = StateSerializer.this;
                super();
            }
        });
    }

    public static StateSerializer getInstance()
    {
        return _instance;
    }

    public void deleteAllSerializedState()
    {
        cleanupThreadPool.execute(new Runnable() {

            final StateSerializer this$0;

            public void run()
            {
                deleteAllSerializedStateSync();
            }

            
            {
                this$0 = StateSerializer.this;
                super();
            }
        });
    }

    public void deleteAllSerializedStateSync()
    {
        try
        {
            WishApplication.getAppInstance().deleteFile("serialized_session");
        }
        catch (Throwable throwable3) { }
        try
        {
            WishApplication.getAppInstance().deleteFile("serialized_profile");
        }
        catch (Throwable throwable2) { }
        try
        {
            WishApplication.getAppInstance().deleteFile("serialized_following");
        }
        catch (Throwable throwable1) { }
        try
        {
            WishApplication.getAppInstance().deleteFile("serialized_status");
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }

    public void deleteSerializedSessionState()
    {
        cleanupThreadPool.execute(new Runnable() {

            final StateSerializer this$0;

            public void run()
            {
                WishApplication.getAppInstance().deleteFile("serialized_session");
            }

            
            {
                this$0 = StateSerializer.this;
                super();
            }
        });
    }

    public ExecutorService getThreadPool(SerializationType serializationtype)
    {
        static class _cls8
        {

            static final int $SwitchMap$com$contextlogic$wish$util$StateSerializer$SerializationType[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$util$StateSerializer$SerializationType = new int[SerializationType.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$StateSerializer$SerializationType[SerializationType.Profile.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$StateSerializer$SerializationType[SerializationType.Follower.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$StateSerializer$SerializationType[SerializationType.Session.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$StateSerializer$SerializationType[SerializationType.Status.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls8..SwitchMap.com.contextlogic.wish.util.StateSerializer.SerializationType[serializationtype.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return profileSerializerThreadPool;

        case 2: // '\002'
            return followerSerializerThreadPool;

        case 3: // '\003'
            return sessionSerializerThreadPool;

        case 4: // '\004'
            return statusSerializerThreadPool;
        }
    }

}
