.class public final Lcom/google/android/gms/nearby/Nearby;
.super Ljava/lang/Object;


# static fields
.field public static final CONNECTIONS_API:Lcom/google/android/gms/common/api/Api;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api",
            "<",
            "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final Connections:Lcom/google/android/gms/nearby/connection/Connections;

.field public static final zzaEX:Lcom/google/android/gms/common/api/Api;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api",
            "<",
            "Lcom/google/android/gms/nearby/messages/zze;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzaEY:Lcom/google/android/gms/nearby/messages/zzc;

.field public static final zzaEZ:Lcom/google/android/gms/nearby/messages/zzd;

.field public static final zzaFa:Lcom/google/android/gms/common/api/Api;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api",
            "<",
            "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzaFb:Lcom/google/android/gms/nearby/sharing/zzd;

.field public static final zzaFc:Lcom/google/android/gms/nearby/sharing/zze;

.field public static final zzaFd:Lcom/google/android/gms/common/api/Api;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api",
            "<",
            "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzaFe:Lcom/google/android/gms/nearby/bootstrap/zza;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v5, 0x0

    new-instance v0, Lcom/google/android/gms/common/api/Api;

    const-string v1, "Nearby.CONNECTIONS_API"

    sget-object v2, Lcom/google/android/gms/internal/zzoq;->zzNY:Lcom/google/android/gms/common/api/Api$zza;

    sget-object v3, Lcom/google/android/gms/internal/zzoq;->zzNX:Lcom/google/android/gms/common/api/Api$ClientKey;

    new-array v4, v5, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/common/api/Api;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/Api$zza;Lcom/google/android/gms/common/api/Api$ClientKey;[Lcom/google/android/gms/common/api/Scope;)V

    sput-object v0, Lcom/google/android/gms/nearby/Nearby;->CONNECTIONS_API:Lcom/google/android/gms/common/api/Api;

    new-instance v0, Lcom/google/android/gms/internal/zzoq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzoq;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/Nearby;->Connections:Lcom/google/android/gms/nearby/connection/Connections;

    new-instance v0, Lcom/google/android/gms/common/api/Api;

    const-string v1, "Nearby.MESSAGES_API"

    sget-object v2, Lcom/google/android/gms/nearby/messages/internal/zzg;->zzNY:Lcom/google/android/gms/common/api/Api$zza;

    sget-object v3, Lcom/google/android/gms/nearby/messages/internal/zzg;->zzNX:Lcom/google/android/gms/common/api/Api$ClientKey;

    new-array v4, v5, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/common/api/Api;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/Api$zza;Lcom/google/android/gms/common/api/Api$ClientKey;[Lcom/google/android/gms/common/api/Scope;)V

    sput-object v0, Lcom/google/android/gms/nearby/Nearby;->zzaEX:Lcom/google/android/gms/common/api/Api;

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/zzg;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/zzg;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/Nearby;->zzaEY:Lcom/google/android/gms/nearby/messages/zzc;

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/zzh;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/zzh;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/Nearby;->zzaEZ:Lcom/google/android/gms/nearby/messages/zzd;

    new-instance v0, Lcom/google/android/gms/common/api/Api;

    const-string v1, "Nearby.SHARING_API"

    sget-object v2, Lcom/google/android/gms/nearby/sharing/internal/zzh;->zzNY:Lcom/google/android/gms/common/api/Api$zza;

    sget-object v3, Lcom/google/android/gms/nearby/sharing/internal/zzh;->zzNX:Lcom/google/android/gms/common/api/Api$ClientKey;

    new-array v4, v5, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/common/api/Api;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/Api$zza;Lcom/google/android/gms/common/api/Api$ClientKey;[Lcom/google/android/gms/common/api/Scope;)V

    sput-object v0, Lcom/google/android/gms/nearby/Nearby;->zzaFa:Lcom/google/android/gms/common/api/Api;

    new-instance v0, Lcom/google/android/gms/nearby/sharing/internal/zzh;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/sharing/internal/zzh;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/Nearby;->zzaFb:Lcom/google/android/gms/nearby/sharing/zzd;

    new-instance v0, Lcom/google/android/gms/nearby/sharing/internal/zzi;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/sharing/internal/zzi;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/Nearby;->zzaFc:Lcom/google/android/gms/nearby/sharing/zze;

    new-instance v0, Lcom/google/android/gms/common/api/Api;

    const-string v1, "Nearby.BOOTSTRAP_API"

    sget-object v2, Lcom/google/android/gms/internal/zzoi;->zzNY:Lcom/google/android/gms/common/api/Api$zza;

    sget-object v3, Lcom/google/android/gms/internal/zzoi;->zzNX:Lcom/google/android/gms/common/api/Api$ClientKey;

    new-array v4, v5, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/common/api/Api;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/Api$zza;Lcom/google/android/gms/common/api/Api$ClientKey;[Lcom/google/android/gms/common/api/Scope;)V

    sput-object v0, Lcom/google/android/gms/nearby/Nearby;->zzaFd:Lcom/google/android/gms/common/api/Api;

    new-instance v0, Lcom/google/android/gms/internal/zzoi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzoi;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/Nearby;->zzaFe:Lcom/google/android/gms/nearby/bootstrap/zza;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
