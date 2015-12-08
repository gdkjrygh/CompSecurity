.class Lcom/google/android/gms/auth/api/credentials/internal/zzc$1$1;
.super Lcom/google/android/gms/auth/api/credentials/internal/zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/auth/api/credentials/internal/zzc$1;->zza(Landroid/content/Context;Lcom/google/android/gms/auth/api/credentials/internal/ICredentialsService;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzPe:Lcom/google/android/gms/auth/api/credentials/internal/zzc$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/auth/api/credentials/internal/zzc$1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/internal/zzc$1$1;->zzPe:Lcom/google/android/gms/auth/api/credentials/internal/zzc$1;

    invoke-direct {p0}, Lcom/google/android/gms/auth/api/credentials/internal/zza;-><init>()V

    return-void
.end method


# virtual methods
.method public onCredentialResult(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V
    .locals 2
    .param p1, "status"    # Lcom/google/android/gms/common/api/Status;
    .param p2, "credential"    # Lcom/google/android/gms/auth/api/credentials/Credential;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/internal/zzc$1$1;->zzPe:Lcom/google/android/gms/auth/api/credentials/internal/zzc$1;

    new-instance v1, Lcom/google/android/gms/auth/api/credentials/internal/zzb;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/auth/api/credentials/internal/zzb;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/internal/zzc$1;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
