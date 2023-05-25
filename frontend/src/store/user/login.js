import {defineStore} from "pinia";
import axios from "axios";


export const loginStore = defineStore("login", {
    id: "login",

    state: () => ({
        email : "",
        password: ""
    }),

    actions: {
        // 로그인
        async login() {
            try{
                await axios.post(`api/user/login`, this.$state)
                axios.defaults.headers.post['Content-Type'] = 'multipart/form-data';

                console.log(this.$state);

            } catch (e) {
                console.error('login error: ', e);
            }
        }
    }
})