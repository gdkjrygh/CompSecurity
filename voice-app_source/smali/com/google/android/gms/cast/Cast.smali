.class public final Lcom/google/android/gms/cast/Cast;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/Cast$CastApi;,
        Lcom/google/android/gms/cast/Cast$zza;,
        Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;,
        Lcom/google/android/gms/cast/Cast$CastOptions;,
        Lcom/google/android/gms/cast/Cast$MessageReceivedCallback;,
        Lcom/google/android/gms/cast/Cast$Listener;
    }
.end annotation


# static fields
.field public static final ACTIVE_INPUT_STATE_NO:I = 0x0

.field public static final ACTIVE_INPUT_STATE_UNKNOWN:I = -0x1

.field public static final ACTIVE_INPUT_STATE_YES:I = 0x1

.field public static final API:Lcom/google/android/gms/common/api/Api;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api",
            "<",
            "Lcom/google/android/gms/cast/Cast$CastOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final CastApi:Lcom/google/android/gms/cast/Cast$CastApi;

.field public static final EXTRA_APP_NO_LONGER_RUNNING:Ljava/lang/String; = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING"

.field public static final MAX_MESSAGE_LENGTH:I = 0x10000

.field public static final MAX_NAMESPACE_LENGTH:I = 0x80

.field public static final STANDBY_STATE_NO:I = 0x0

.field public static final STANDBY_STATE_UNKNOWN:I = -0x1

.field public static final STANDBY_STATE_YES:I = 0x1

.field private static final zzNY:Lcom/google/android/gms/common/api/Api$zza;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api$zza",
            "<",
            "Lcom/google/android/gms/cast/internal/zze;",
            "Lcom/google/android/gms/cast/Cast$CastOptions;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/cast/Cast$1;

    invoke-direct {v0}, Lcom/google/android/gms/cast/Cast$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/Cast;->zzNY:Lcom/google/android/gms/common/api/Api$zza;

    new-instance v0, Lcom/google/android/gms/common/api/Api;

    const-string v1, "Cast.API"

    sget-object v2, Lcom/google/android/gms/cast/Cast;->zzNY:Lcom/google/android/gms/common/api/Api$zza;

    sget-object v3, Lcom/google/android/gms/cast/internal/zzk;->zzNX:Lcom/google/android/gms/common/api/Api$ClientKey;

    const/4 v4, 0x0

    new-array v4, v4, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/common/api/Api;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/Api$zza;Lcom/google/android/gms/common/api/Api$ClientKey;[Lcom/google/android/gms/common/api/Scope;)V

    sput-object v0, Lcom/google/android/gms/cast/Cast;->API:Lcom/google/android/gms/common/api/Api;

    new-instance v0, Lcom/google/android/gms/cast/Cast$CastApi$zza;

    invoke-direct {v0}, Lcom/google/android/gms/cast/Cast$CastApi$zza;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/Cast;->CastApi:Lcom/google/android/gms/cast/Cast$CastApi;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
