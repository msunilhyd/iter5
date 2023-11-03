import React, { useEffect, useState } from 'react'
import { useParams, useNavigate } from 'react-router-dom'
import Navbar from '../components/Navbar'
import { useAppDispatch, useAppSelector } from '../store/hooks'
import { getRecommendedVideos } from '../store/reducers/getRecommendedVideos'
import { getVideoDetails } from '../store/reducers/getVideoDetails'
import { BiLike, BiDisike } from 'react-icons/bi'
import { HiScissors } from 'react-icons/hi'
import { MdOutlinePlaylistAdd } from 'react-icons/md'
import { FaShare } from 'react-icons/fa'
import { BsThreeDots } from 'react-icons/bs'
import WatchCard from '../components/WatchCard'

export default function Watch() {
  const [showMoreStatus, setShowMoreStatus] = useState<boolean>(false);
  const { id } = useParams()
  const dispatch = useAppDispatch()
  const navigate = useNavigate()
  const currentPlaying = useAppSelector(
    (state) => state.youtubeApp.currentPlaying
  )
  const recommendedVideos = useAppSelector(
    (state) => state.youtubeApp.recommendedVideos
  )
  useEffect(() => {
    if (id) {
      dispatch(getVideoDetails(id))
      setShowMoreStatus(false)
    } else {
      navigate("/")
    }
  }, [id, navigate, dispatch])

  useEffect(() => {
    if (currentPlaying && id) dispatch(getRecommendedVideos(id))
  }, [currentPlaying, dispatch, id])

  return (
    <>
      {currentPlaying && currentPlaying?.videoId === id && (
        <div className="max-h-screen overflow-hidden">
          <div style={{ height: "7.5vh" }}>
            <Navbar />
          </div>
          <div className="flex w-full" style={{ height: "92.5vh" }}>
            <div className="flex gap-y-10 gap-x-5 p-7 mx-20 mr-0 w-full overflow-auto">
              <div style={{ maxWidth: "800px" }}>
                <div>
                  <iframe
                    width="800"
                    height="502"
                    src={`https://www.youtube.com/embed/${id}?autoplay=1`}
                    title="YouTube video player"
                    frameBorder="0"
                    allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
                    allowFullScreen
                  >
                    <div className="mt-5">
                      <p className="text-xl">{currentPlaying.videoTitle}</p>
                      <div className="flex justify-between mt-1">
                        <div className="text-sm text-gray-400">
                          <span className="after:content-['•'] after:mx-1">
                            {currentPlaying.videosViews} views
                          </span>
                          <span> {currentPlaying.videoAge} ago </span>
                        </div>
                      </div>
                    </div>
                  </iframe>
                </div>
              </div>
            </div>
          </div>
        </div>
      )}
    </>
  )
}