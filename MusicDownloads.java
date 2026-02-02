public class MusicDownloads{
  private List<DownloadInfo> downloadList;

  public MusicDownloads()
  {   downloadList = new ArrayList<DownloadInfo>();   }

  public DownloadInfo getDownloadInfo(String title)
  {
    /* To be implemented in part (a) */
    for(DownloadInfo info : downloadList)
    {
      if(title.equals(info.getTitle()))
      {
        return info;
      }
      return null;
    }

  }

  public void updateDownloadInfo(List<String> titles)
  {
    /* To be implemented in part (b) */
    for(String x: titles)
    {
      if(x.getDownloadInfo().equals(titles))
      {
        
      }
    }


  }
}
