.class public final Lcom/google/android/gms/internal/zzpt;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/Api$ApiOptions$Optional;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzpt$1;,
        Lcom/google/android/gms/internal/zzpt$zza;
    }
.end annotation


# static fields
.field public static final zzaJQ:Lcom/google/android/gms/internal/zzpt;


# instance fields
.field private final zzaJR:Z

.field private final zzaJS:Z

.field private final zzaJT:Ljava/lang/String;

.field private final zzaJU:Lcom/google/android/gms/common/api/GoogleApiClient$ServerAuthCodeCallbacks;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzpt$zza;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzpt$zza;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzpt$zza;->zzyc()Lcom/google/android/gms/internal/zzpt;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/zzpt;->zzaJQ:Lcom/google/android/gms/internal/zzpt;

    return-void
.end method

.method private constructor <init>(ZZLjava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ServerAuthCodeCallbacks;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzpt;->zzaJR:Z

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzpt;->zzaJS:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/zzpt;->zzaJT:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzpt;->zzaJU:Lcom/google/android/gms/common/api/GoogleApiClient$ServerAuthCodeCallbacks;

    return-void
.end method

.method synthetic constructor <init>(ZZLjava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ServerAuthCodeCallbacks;Lcom/google/android/gms/internal/zzpt$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzpt;-><init>(ZZLjava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ServerAuthCodeCallbacks;)V

    return-void
.end method


# virtual methods
.method public zzxZ()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzpt;->zzaJR:Z

    return v0
.end method

.method public zzxt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpt;->zzaJT:Ljava/lang/String;

    return-object v0
.end method

.method public zzya()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzpt;->zzaJS:Z

    return v0
.end method

.method public zzyb()Lcom/google/android/gms/common/api/GoogleApiClient$ServerAuthCodeCallbacks;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpt;->zzaJU:Lcom/google/android/gms/common/api/GoogleApiClient$ServerAuthCodeCallbacks;

    return-object v0
.end method
