import React from 'react'
import { useDispatch,  } from 'react-redux'
import { logout } from '../../redux/slice/userSlice';
export default function Logout() {
    const dispatch = useDispatch();

    const logouth = async () => {
        dispatch(logout())
        if(localStorage.getItem("token")===null){
            window.location.replace('/');
        }
    }

    return (
        <button onClick={logouth}>Logout</button>
    )
}
