.class public final Lcom/google/android/gms/common/internal/zzi$zzd;
.super Lcom/google/android/gms/common/internal/zzo$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/internal/zzi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zzd"
.end annotation


# instance fields
.field private final zzaaA:I

.field private zzaaz:Lcom/google/android/gms/common/internal/zzi;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/zzi;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/zzo$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/internal/zzi$zzd;->zzaaz:Lcom/google/android/gms/common/internal/zzi;

    iput p2, p0, Lcom/google/android/gms/common/internal/zzi$zzd;->zzaaA:I

    return-void
.end method

.method private zznS()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/common/internal/zzi$zzd;->zzaaz:Lcom/google/android/gms/common/internal/zzi;

    return-void
.end method


# virtual methods
.method public zza(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/internal/zzi$zzd;->zzaaz:Lcom/google/android/gms/common/internal/zzi;

    const-string v1, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/common/internal/zzi$zzd;->zzaaz:Lcom/google/android/gms/common/internal/zzi;

    iget v1, p0, Lcom/google/android/gms/common/internal/zzi$zzd;->zzaaA:I

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/google/android/gms/common/internal/zzi;->zza(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/zzi$zzd;->zznS()V

    return-void
.end method

.method public zzb(ILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/internal/zzi$zzd;->zzaaz:Lcom/google/android/gms/common/internal/zzi;

    const-string v1, "onAccountValidationComplete can be called only once per call to validateAccount"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/common/internal/zzi$zzd;->zzaaz:Lcom/google/android/gms/common/internal/zzi;

    iget v1, p0, Lcom/google/android/gms/common/internal/zzi$zzd;->zzaaA:I

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/common/internal/zzi;->zza(ILandroid/os/Bundle;I)V

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/zzi$zzd;->zznS()V

    return-void
.end method
