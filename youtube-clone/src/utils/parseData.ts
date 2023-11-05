import axios from 'axios'
import { 
  convertRawViewstoString,
  parseVideoDuration,
  timeSince,
} from './index'
import { YOUTUBE_API_URL } from './constants'
import { HomePageVideos } from './Types'

const API_KEY = process.env.REACT_APP_YOUTUBE_DATA_API_KEY

export const parseData = async (items: any[]) => {
  try {
    const videoIds: string[] = [];
    const channelIds: string[] = [];

    items.forEach(
      (item: { snippet: { channelId: string }; id : { videoId: string } }) => {
        channelIds.push(item.snippet.channelId);
        videoIds.push(item.id.videoId);
      }
    );

    const {
      data: { items: channelData },
    } = await axios.get(
      `${YOUTUBE_API_URL}/channels?part=snippet,contentDetails&=id=${channelIds.join(
        ","
      )}&key=${API_KEY}`
    );

    const parsedChannelsData: { id: string; image: string }[] = [];
    channelsData.forEach(
      (channel: {
        id: string;
        snippet: { thumbnails: { default: { url: string } } };
      }) => 
        parsedChannelsData.push({
          id: channel.id,
          image: channel.snippet.thumbnails.default.url,
        })
    );
    const {
      data: { items: videoData },
    }
  }
}