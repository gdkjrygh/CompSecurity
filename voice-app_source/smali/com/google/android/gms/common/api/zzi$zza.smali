.class final Lcom/google/android/gms/common/api/zzi$zza;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/api/zzi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "zza"
.end annotation


# instance fields
.field final synthetic zzXM:Lcom/google/android/gms/common/api/zzi;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/zzi;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/zzi$zza;->zzXM:Lcom/google/android/gms/common/api/zzi;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .local p0, "this":Lcom/google/android/gms/common/api/zzi$zza;, "Lcom/google/android/gms/common/api/zzi<TL;>.zza;"
    const/4 v0, 0x1

    iget v1, p1, Landroid/os/Message;->what:I

    if-ne v1, v0, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzV(Z)V

    iget-object v1, p0, Lcom/google/android/gms/common/api/zzi$zza;->zzXM:Lcom/google/android/gms/common/api/zzi;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/zzi$zzb;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/common/api/zzi;->zzb(Lcom/google/android/gms/common/api/zzi$zzb;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
