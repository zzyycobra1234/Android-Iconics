/*
 * Copyright 2014 Mike Penz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mikepenz.google_material_typeface_library;

import android.content.Context;
import android.graphics.Typeface;

import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.iconics.typeface.ITypeface;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class GoogleMaterial implements ITypeface {
    private static final String TTF_FILE = "google-material-font-v2.2.0.1.original.ttf";
    private static Typeface typeface = null;
    private static HashMap<String, Character> mChars;

    @Override
    public IIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    @Override
    public HashMap<String, Character> getCharacters() {
        if (mChars == null) {
            HashMap<String, Character> aChars = new HashMap<String, Character>();
            for (Icon v : Icon.values()) {
                aChars.put(v.name(), v.character);
            }
            mChars = aChars;
        }
        return mChars;
    }

    @Override
    public String getMappingPrefix() {
        return "gmd";
    }

    @Override
    public String getFontName() {
        return "Google Material";
    }

    @Override
    public String getVersion() {
        return "2.2.0.3";
    }

    @Override
    public int getIconCount() {
        return mChars.size();
    }

    @Override
    public Collection<String> getIcons() {
        Collection<String> icons = new LinkedList<String>();
        for (Icon value : Icon.values()) {
            icons.add(value.name());
        }
        return icons;
    }

    @Override
    public String getAuthor() {
        return "Google";
    }

    @Override
    public String getUrl() {
        return "https://github.com/google/material-design-icons";
    }

    @Override
    public String getDescription() {
        return "Material design icons are the official icon set from Google that are designed under the material design guidelines.";
    }

    @Override
    public String getLicense() {
        return "CC-BY 4.0";
    }

    @Override
    public String getLicenseUrl() {
        return "http://creativecommons.org/licenses/by/4.0/";
    }

    @Override
    public Typeface getTypeface(Context context) {
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + TTF_FILE);
            } catch (Exception e) {
                return null;
            }
        }
        return typeface;
    }

    public enum Icon implements IIcon {
        gmd_3d_rotation('\ue84d'),
        gmd_ac_unit('\ueb3b'),
        gmd_access_alarm('\ue190'),
        gmd_access_alarms('\ue191'),
        gmd_access_time('\ue192'),
        gmd_accessibility('\ue84e'),
        gmd_accessible('\ue914'),
        gmd_account_balance('\ue84f'),
        gmd_account_balance_wallet('\ue850'),
        gmd_account_box('\ue851'),
        gmd_account_circle('\ue853'),
        gmd_adb('\ue60e'),
        gmd_add('\ue145'),
        gmd_add_a_photo('\ue439'),
        gmd_add_alarm('\ue193'),
        gmd_add_alert('\ue003'),
        gmd_add_box('\ue146'),
        gmd_add_circle('\ue147'),
        gmd_add_circle_outline('\ue148'),
        gmd_add_location('\ue567'),
        gmd_add_shopping_cart('\ue854'),
        gmd_add_to_photos('\ue39d'),
        gmd_add_to_queue('\ue05c'),
        gmd_adjust('\ue39e'),
        gmd_airline_seat_flat('\ue630'),
        gmd_airline_seat_flat_angled('\ue631'),
        gmd_airline_seat_individual_suite('\ue632'),
        gmd_airline_seat_legroom_extra('\ue633'),
        gmd_airline_seat_legroom_normal('\ue634'),
        gmd_airline_seat_legroom_reduced('\ue635'),
        gmd_airline_seat_recline_extra('\ue636'),
        gmd_airline_seat_recline_normal('\ue637'),
        gmd_airplanemode_active('\ue195'),
        gmd_airplanemode_inactive('\ue194'),
        gmd_airplay('\ue055'),
        gmd_airport_shuttle('\ueb3c'),
        gmd_alarm('\ue855'),
        gmd_alarm_add('\ue856'),
        gmd_alarm_off('\ue857'),
        gmd_alarm_on('\ue858'),
        gmd_album('\ue019'),
        gmd_all_inclusive('\ueb3d'),
        gmd_all_out('\ue90b'),
        gmd_android('\ue859'),
        gmd_announcement('\ue85a'),
        gmd_apps('\ue5c3'),
        gmd_archive('\ue149'),
        gmd_arrow_back('\ue5c4'),
        gmd_arrow_downward('\ue5db'),
        gmd_arrow_drop_down('\ue5c5'),
        gmd_arrow_drop_down_circle('\ue5c6'),
        gmd_arrow_drop_up('\ue5c7'),
        gmd_arrow_forward('\ue5c8'),
        gmd_arrow_upward('\ue5d8'),
        gmd_art_track('\ue060'),
        gmd_aspect_ratio('\ue85b'),
        gmd_assessment('\ue85c'),
        gmd_assignment('\ue85d'),
        gmd_assignment_ind('\ue85e'),
        gmd_assignment_late('\ue85f'),
        gmd_assignment_return('\ue860'),
        gmd_assignment_returned('\ue861'),
        gmd_assignment_turned_in('\ue862'),
        gmd_assistant('\ue39f'),
        gmd_assistant_photo('\ue3a0'),
        gmd_attach_file('\ue226'),
        gmd_attach_money('\ue227'),
        gmd_attachment('\ue2bc'),
        gmd_audiotrack('\ue3a1'),
        gmd_autorenew('\ue863'),
        gmd_av_timer('\ue01b'),
        gmd_backspace('\ue14a'),
        gmd_backup('\ue864'),
        gmd_battery_alert('\ue19c'),
        gmd_battery_charging_full('\ue1a3'),
        gmd_battery_full('\ue1a4'),
        gmd_battery_std('\ue1a5'),
        gmd_battery_unknown('\ue1a6'),
        gmd_beach_access('\ueb3e'),
        gmd_beenhere('\ue52d'),
        gmd_block('\ue14b'),
        gmd_bluetooth('\ue1a7'),
        gmd_bluetooth_audio('\ue60f'),
        gmd_bluetooth_connected('\ue1a8'),
        gmd_bluetooth_disabled('\ue1a9'),
        gmd_bluetooth_searching('\ue1aa'),
        gmd_blur_circular('\ue3a2'),
        gmd_blur_linear('\ue3a3'),
        gmd_blur_off('\ue3a4'),
        gmd_blur_on('\ue3a5'),
        gmd_book('\ue865'),
        gmd_bookmark('\ue866'),
        gmd_bookmark_border('\ue867'),
        gmd_border_all('\ue228'),
        gmd_border_bottom('\ue229'),
        gmd_border_clear('\ue22a'),
        gmd_border_color('\ue22b'),
        gmd_border_horizontal('\ue22c'),
        gmd_border_inner('\ue22d'),
        gmd_border_left('\ue22e'),
        gmd_border_outer('\ue22f'),
        gmd_border_right('\ue230'),
        gmd_border_style('\ue231'),
        gmd_border_top('\ue232'),
        gmd_border_vertical('\ue233'),
        gmd_branding_watermark('\ue06b'),
        gmd_brightness_1('\ue3a6'),
        gmd_brightness_2('\ue3a7'),
        gmd_brightness_3('\ue3a8'),
        gmd_brightness_4('\ue3a9'),
        gmd_brightness_5('\ue3aa'),
        gmd_brightness_6('\ue3ab'),
        gmd_brightness_7('\ue3ac'),
        gmd_brightness_auto('\ue1ab'),
        gmd_brightness_high('\ue1ac'),
        gmd_brightness_low('\ue1ad'),
        gmd_brightness_medium('\ue1ae'),
        gmd_broken_image('\ue3ad'),
        gmd_brush('\ue3ae'),
        gmd_bubble_chart('\ue6dd'),
        gmd_bug_report('\ue868'),
        gmd_build('\ue869'),
        gmd_burst_mode('\ue43c'),
        gmd_business('\ue0af'),
        gmd_business_center('\ueb3f'),
        gmd_cached('\ue86a'),
        gmd_cake('\ue7e9'),
        gmd_call('\ue0b0'),
        gmd_call_end('\ue0b1'),
        gmd_call_made('\ue0b2'),
        gmd_call_merge('\ue0b3'),
        gmd_call_missed('\ue0b4'),
        gmd_call_missed_outgoing('\ue0e4'),
        gmd_call_received('\ue0b5'),
        gmd_call_split('\ue0b6'),
        gmd_call_to_action('\ue06c'),
        gmd_camera('\ue3af'),
        gmd_camera_alt('\ue3b0'),
        gmd_camera_enhance('\ue8fc'),
        gmd_camera_front('\ue3b1'),
        gmd_camera_rear('\ue3b2'),
        gmd_camera_roll('\ue3b3'),
        gmd_cancel('\ue5c9'),
        gmd_card_giftcard('\ue8f6'),
        gmd_card_membership('\ue8f7'),
        gmd_card_travel('\ue8f8'),
        gmd_casino('\ueb40'),
        gmd_cast('\ue307'),
        gmd_cast_connected('\ue308'),
        gmd_center_focus_strong('\ue3b4'),
        gmd_center_focus_weak('\ue3b5'),
        gmd_change_history('\ue86b'),
        gmd_chat('\ue0b7'),
        gmd_chat_bubble('\ue0ca'),
        gmd_chat_bubble_outline('\ue0cb'),
        gmd_check('\ue5ca'),
        gmd_check_box('\ue834'),
        gmd_check_box_outline_blank('\ue835'),
        gmd_check_circle('\ue86c'),
        gmd_chevron_left('\ue5cb'),
        gmd_chevron_right('\ue5cc'),
        gmd_child_care('\ueb41'),
        gmd_child_friendly('\ueb42'),
        gmd_chrome_reader_mode('\ue86d'),
        gmd_class('\ue86e'),
        gmd_clear('\ue14c'),
        gmd_clear_all('\ue0b8'),
        gmd_close('\ue5cd'),
        gmd_closed_caption('\ue01c'),
        gmd_cloud('\ue2bd'),
        gmd_cloud_circle('\ue2be'),
        gmd_cloud_done('\ue2bf'),
        gmd_cloud_download('\ue2c0'),
        gmd_cloud_off('\ue2c1'),
        gmd_cloud_queue('\ue2c2'),
        gmd_cloud_upload('\ue2c3'),
        gmd_code('\ue86f'),
        gmd_collections('\ue3b6'),
        gmd_collections_bookmark('\ue431'),
        gmd_color_lens('\ue3b7'),
        gmd_colorize('\ue3b8'),
        gmd_comment('\ue0b9'),
        gmd_compare('\ue3b9'),
        gmd_compare_arrows('\ue915'),
        gmd_computer('\ue30a'),
        gmd_confirmation_number('\ue638'),
        gmd_contact_mail('\ue0d0'),
        gmd_contact_phone('\ue0cf'),
        gmd_contacts('\ue0ba'),
        gmd_content_copy('\ue14d'),
        gmd_content_cut('\ue14e'),
        gmd_content_paste('\ue14f'),
        gmd_control_point('\ue3ba'),
        gmd_control_point_duplicate('\ue3bb'),
        gmd_copyright('\ue90c'),
        gmd_create('\ue150'),
        gmd_create_new_folder('\ue2cc'),
        gmd_credit_card('\ue870'),
        gmd_crop('\ue3be'),
        gmd_crop_16_9('\ue3bc'),
        gmd_crop_3_2('\ue3bd'),
        gmd_crop_5_4('\ue3bf'),
        gmd_crop_7_5('\ue3c0'),
        gmd_crop_din('\ue3c1'),
        gmd_crop_free('\ue3c2'),
        gmd_crop_landscape('\ue3c3'),
        gmd_crop_original('\ue3c4'),
        gmd_crop_portrait('\ue3c5'),
        gmd_crop_rotate('\ue437'),
        gmd_crop_square('\ue3c6'),
        gmd_dashboard('\ue871'),
        gmd_data_usage('\ue1af'),
        gmd_date_range('\ue916'),
        gmd_dehaze('\ue3c7'),
        gmd_delete('\ue872'),
        gmd_delete_forever('\ue92b'),
        gmd_delete_sweep('\ue16c'),
        gmd_description('\ue873'),
        gmd_desktop_mac('\ue30b'),
        gmd_desktop_windows('\ue30c'),
        gmd_details('\ue3c8'),
        gmd_developer_board('\ue30d'),
        gmd_developer_mode('\ue1b0'),
        gmd_device_hub('\ue335'),
        gmd_devices('\ue1b1'),
        gmd_devices_other('\ue337'),
        gmd_dialer_sip('\ue0bb'),
        gmd_dialpad('\ue0bc'),
        gmd_directions('\ue52e'),
        gmd_directions_bike('\ue52f'),
        gmd_directions_boat('\ue532'),
        gmd_directions_bus('\ue530'),
        gmd_directions_car('\ue531'),
        gmd_directions_railway('\ue534'),
        gmd_directions_run('\ue566'),
        gmd_directions_subway('\ue533'),
        gmd_directions_transit('\ue535'),
        gmd_directions_walk('\ue536'),
        gmd_disc_full('\ue610'),
        gmd_dns('\ue875'),
        gmd_do_not_disturb('\ue612'),
        gmd_do_not_disturb_alt('\ue611'),
        gmd_do_not_disturb_off('\ue643'),
        gmd_do_not_disturb_on('\ue644'),
        gmd_dock('\ue30e'),
        gmd_domain('\ue7ee'),
        gmd_done('\ue876'),
        gmd_done_all('\ue877'),
        gmd_donut_large('\ue917'),
        gmd_donut_small('\ue918'),
        gmd_drafts('\ue151'),
        gmd_drag_handle('\ue25d'),
        gmd_drive_eta('\ue613'),
        gmd_dvr('\ue1b2'),
        gmd_edit('\ue3c9'),
        gmd_edit_location('\ue568'),
        gmd_eject('\ue8fb'),
        gmd_email('\ue0be'),
        gmd_enhanced_encryption('\ue63f'),
        gmd_equalizer('\ue01d'),
        gmd_error('\ue000'),
        gmd_error_outline('\ue001'),
        gmd_euro_symbol('\ue926'),
        gmd_ev_station('\ue56d'),
        gmd_event('\ue878'),
        gmd_event_available('\ue614'),
        gmd_event_busy('\ue615'),
        gmd_event_note('\ue616'),
        gmd_event_seat('\ue903'),
        gmd_exit_to_app('\ue879'),
        gmd_expand_less('\ue5ce'),
        gmd_expand_more('\ue5cf'),
        gmd_explicit('\ue01e'),
        gmd_explore('\ue87a'),
        gmd_exposure('\ue3ca'),
        gmd_exposure_neg_1('\ue3cb'),
        gmd_exposure_neg_2('\ue3cc'),
        gmd_exposure_plus_1('\ue3cd'),
        gmd_exposure_plus_2('\ue3ce'),
        gmd_exposure_zero('\ue3cf'),
        gmd_extension('\ue87b'),
        gmd_face('\ue87c'),
        gmd_fast_forward('\ue01f'),
        gmd_fast_rewind('\ue020'),
        gmd_favorite('\ue87d'),
        gmd_favorite_border('\ue87e'),
        gmd_featured_play_list('\ue06d'),
        gmd_featured_video('\ue06e'),
        gmd_feedback('\ue87f'),
        gmd_fiber_dvr('\ue05d'),
        gmd_fiber_manual_record('\ue061'),
        gmd_fiber_new('\ue05e'),
        gmd_fiber_pin('\ue06a'),
        gmd_fiber_smart_record('\ue062'),
        gmd_file_download('\ue2c4'),
        gmd_file_upload('\ue2c6'),
        gmd_filter('\ue3d3'),
        gmd_filter_1('\ue3d0'),
        gmd_filter_2('\ue3d1'),
        gmd_filter_3('\ue3d2'),
        gmd_filter_4('\ue3d4'),
        gmd_filter_5('\ue3d5'),
        gmd_filter_6('\ue3d6'),
        gmd_filter_7('\ue3d7'),
        gmd_filter_8('\ue3d8'),
        gmd_filter_9('\ue3d9'),
        gmd_filter_9_plus('\ue3da'),
        gmd_filter_b_and_w('\ue3db'),
        gmd_filter_center_focus('\ue3dc'),
        gmd_filter_drama('\ue3dd'),
        gmd_filter_frames('\ue3de'),
        gmd_filter_hdr('\ue3df'),
        gmd_filter_list('\ue152'),
        gmd_filter_none('\ue3e0'),
        gmd_filter_tilt_shift('\ue3e2'),
        gmd_filter_vintage('\ue3e3'),
        gmd_find_in_page('\ue880'),
        gmd_find_replace('\ue881'),
        gmd_fingerprint('\ue90d'),
        gmd_first_page('\ue5dc'),
        gmd_fitness_center('\ueb43'),
        gmd_flag('\ue153'),
        gmd_flare('\ue3e4'),
        gmd_flash_auto('\ue3e5'),
        gmd_flash_off('\ue3e6'),
        gmd_flash_on('\ue3e7'),
        gmd_flight('\ue539'),
        gmd_flight_land('\ue904'),
        gmd_flight_takeoff('\ue905'),
        gmd_flip('\ue3e8'),
        gmd_flip_to_back('\ue882'),
        gmd_flip_to_front('\ue883'),
        gmd_folder('\ue2c7'),
        gmd_folder_open('\ue2c8'),
        gmd_folder_shared('\ue2c9'),
        gmd_folder_special('\ue617'),
        gmd_font_download('\ue167'),
        gmd_format_align_center('\ue234'),
        gmd_format_align_justify('\ue235'),
        gmd_format_align_left('\ue236'),
        gmd_format_align_right('\ue237'),
        gmd_format_bold('\ue238'),
        gmd_format_clear('\ue239'),
        gmd_format_color_fill('\ue23a'),
        gmd_format_color_reset('\ue23b'),
        gmd_format_color_text('\ue23c'),
        gmd_format_indent_decrease('\ue23d'),
        gmd_format_indent_increase('\ue23e'),
        gmd_format_italic('\ue23f'),
        gmd_format_line_spacing('\ue240'),
        gmd_format_list_bulleted('\ue241'),
        gmd_format_list_numbered('\ue242'),
        gmd_format_paint('\ue243'),
        gmd_format_quote('\ue244'),
        gmd_format_shapes('\ue25e'),
        gmd_format_size('\ue245'),
        gmd_format_strikethrough('\ue246'),
        gmd_format_textdirection_l_to_r('\ue247'),
        gmd_format_textdirection_r_to_l('\ue248'),
        gmd_format_underlined('\ue249'),
        gmd_forum('\ue0bf'),
        gmd_forward('\ue154'),
        gmd_forward_10('\ue056'),
        gmd_forward_30('\ue057'),
        gmd_forward_5('\ue058'),
        gmd_free_breakfast('\ueb44'),
        gmd_fullscreen('\ue5d0'),
        gmd_fullscreen_exit('\ue5d1'),
        gmd_functions('\ue24a'),
        gmd_g_translate('\ue927'),
        gmd_gamepad('\ue30f'),
        gmd_games('\ue021'),
        gmd_gavel('\ue90e'),
        gmd_gesture('\ue155'),
        gmd_get_app('\ue884'),
        gmd_gif('\ue908'),
        gmd_golf_course('\ueb45'),
        gmd_gps_fixed('\ue1b3'),
        gmd_gps_not_fixed('\ue1b4'),
        gmd_gps_off('\ue1b5'),
        gmd_grade('\ue885'),
        gmd_gradient('\ue3e9'),
        gmd_grain('\ue3ea'),
        gmd_graphic_eq('\ue1b8'),
        gmd_grid_off('\ue3eb'),
        gmd_grid_on('\ue3ec'),
        gmd_group('\ue7ef'),
        gmd_group_add('\ue7f0'),
        gmd_group_work('\ue886'),
        gmd_hd('\ue052'),
        gmd_hdr_off('\ue3ed'),
        gmd_hdr_on('\ue3ee'),
        gmd_hdr_strong('\ue3f1'),
        gmd_hdr_weak('\ue3f2'),
        gmd_headset('\ue310'),
        gmd_headset_mic('\ue311'),
        gmd_healing('\ue3f3'),
        gmd_hearing('\ue023'),
        gmd_help('\ue887'),
        gmd_help_outline('\ue8fd'),
        gmd_high_quality('\ue024'),
        gmd_highlight('\ue25f'),
        gmd_highlight_off('\ue888'),
        gmd_history('\ue889'),
        gmd_home('\ue88a'),
        gmd_hot_tub('\ueb46'),
        gmd_hotel('\ue53a'),
        gmd_hourglass_empty('\ue88b'),
        gmd_hourglass_full('\ue88c'),
        gmd_http('\ue902'),
        gmd_https('\ue88d'),
        gmd_image('\ue3f4'),
        gmd_image_aspect_ratio('\ue3f5'),
        gmd_import_contacts('\ue0e0'),
        gmd_import_export('\ue0c3'),
        gmd_important_devices('\ue912'),
        gmd_inbox('\ue156'),
        gmd_indeterminate_check_box('\ue909'),
        gmd_info('\ue88e'),
        gmd_info_outline('\ue88f'),
        gmd_input('\ue890'),
        gmd_insert_chart('\ue24b'),
        gmd_insert_comment('\ue24c'),
        gmd_insert_drive_file('\ue24d'),
        gmd_insert_emoticon('\ue24e'),
        gmd_insert_invitation('\ue24f'),
        gmd_insert_link('\ue250'),
        gmd_insert_photo('\ue251'),
        gmd_invert_colors('\ue891'),
        gmd_invert_colors_off('\ue0c4'),
        gmd_iso('\ue3f6'),
        gmd_keyboard('\ue312'),
        gmd_keyboard_arrow_down('\ue313'),
        gmd_keyboard_arrow_left('\ue314'),
        gmd_keyboard_arrow_right('\ue315'),
        gmd_keyboard_arrow_up('\ue316'),
        gmd_keyboard_backspace('\ue317'),
        gmd_keyboard_capslock('\ue318'),
        gmd_keyboard_hide('\ue31a'),
        gmd_keyboard_return('\ue31b'),
        gmd_keyboard_tab('\ue31c'),
        gmd_keyboard_voice('\ue31d'),
        gmd_kitchen('\ueb47'),
        gmd_label('\ue892'),
        gmd_label_outline('\ue893'),
        gmd_landscape('\ue3f7'),
        gmd_language('\ue894'),
        gmd_laptop('\ue31e'),
        gmd_laptop_chromebook('\ue31f'),
        gmd_laptop_mac('\ue320'),
        gmd_laptop_windows('\ue321'),
        gmd_last_page('\ue5dd'),
        gmd_launch('\ue895'),
        gmd_layers('\ue53b'),
        gmd_layers_clear('\ue53c'),
        gmd_leak_add('\ue3f8'),
        gmd_leak_remove('\ue3f9'),
        gmd_lens('\ue3fa'),
        gmd_library_add('\ue02e'),
        gmd_library_books('\ue02f'),
        gmd_library_music('\ue030'),
        gmd_lightbulb_outline('\ue90f'),
        gmd_line_style('\ue919'),
        gmd_line_weight('\ue91a'),
        gmd_linear_scale('\ue260'),
        gmd_link('\ue157'),
        gmd_linked_camera('\ue438'),
        gmd_list('\ue896'),
        gmd_live_help('\ue0c6'),
        gmd_live_tv('\ue639'),
        gmd_local_activity('\ue53f'),
        gmd_local_airport('\ue53d'),
        gmd_local_atm('\ue53e'),
        gmd_local_bar('\ue540'),
        gmd_local_cafe('\ue541'),
        gmd_local_car_wash('\ue542'),
        gmd_local_convenience_store('\ue543'),
        gmd_local_dining('\ue556'),
        gmd_local_drink('\ue544'),
        gmd_local_florist('\ue545'),
        gmd_local_gas_station('\ue546'),
        gmd_local_grocery_store('\ue547'),
        gmd_local_hospital('\ue548'),
        gmd_local_hotel('\ue549'),
        gmd_local_laundry_service('\ue54a'),
        gmd_local_library('\ue54b'),
        gmd_local_mall('\ue54c'),
        gmd_local_movies('\ue54d'),
        gmd_local_offer('\ue54e'),
        gmd_local_parking('\ue54f'),
        gmd_local_pharmacy('\ue550'),
        gmd_local_phone('\ue551'),
        gmd_local_pizza('\ue552'),
        gmd_local_play('\ue553'),
        gmd_local_post_office('\ue554'),
        gmd_local_printshop('\ue555'),
        gmd_local_see('\ue557'),
        gmd_local_shipping('\ue558'),
        gmd_local_taxi('\ue559'),
        gmd_location_city('\ue7f1'),
        gmd_location_disabled('\ue1b6'),
        gmd_location_off('\ue0c7'),
        gmd_location_on('\ue0c8'),
        gmd_location_searching('\ue1b7'),
        gmd_lock('\ue897'),
        gmd_lock_open('\ue898'),
        gmd_lock_outline('\ue899'),
        gmd_looks('\ue3fc'),
        gmd_looks_3('\ue3fb'),
        gmd_looks_4('\ue3fd'),
        gmd_looks_5('\ue3fe'),
        gmd_looks_6('\ue3ff'),
        gmd_looks_one('\ue400'),
        gmd_looks_two('\ue401'),
        gmd_loop('\ue028'),
        gmd_loupe('\ue402'),
        gmd_low_priority('\ue16d'),
        gmd_loyalty('\ue89a'),
        gmd_mail('\ue158'),
        gmd_mail_outline('\ue0e1'),
        gmd_map('\ue55b'),
        gmd_markunread('\ue159'),
        gmd_markunread_mailbox('\ue89b'),
        gmd_memory('\ue322'),
        gmd_menu('\ue5d2'),
        gmd_merge_type('\ue252'),
        gmd_message('\ue0c9'),
        gmd_mic('\ue029'),
        gmd_mic_none('\ue02a'),
        gmd_mic_off('\ue02b'),
        gmd_mms('\ue618'),
        gmd_mode_comment('\ue253'),
        gmd_mode_edit('\ue254'),
        gmd_monetization_on('\ue263'),
        gmd_money_off('\ue25c'),
        gmd_monochrome_photos('\ue403'),
        gmd_mood('\ue7f2'),
        gmd_mood_bad('\ue7f3'),
        gmd_more('\ue619'),
        gmd_more_horiz('\ue5d3'),
        gmd_more_vert('\ue5d4'),
        gmd_motorcycle('\ue91b'),
        gmd_mouse('\ue323'),
        gmd_move_to_inbox('\ue168'),
        gmd_movie('\ue02c'),
        gmd_movie_creation('\ue404'),
        gmd_movie_filter('\ue43a'),
        gmd_multiline_chart('\ue6df'),
        gmd_music_note('\ue405'),
        gmd_music_video('\ue063'),
        gmd_my_location('\ue55c'),
        gmd_nature('\ue406'),
        gmd_nature_people('\ue407'),
        gmd_navigate_before('\ue408'),
        gmd_navigate_next('\ue409'),
        gmd_navigation('\ue55d'),
        gmd_near_me('\ue569'),
        gmd_network_cell('\ue1b9'),
        gmd_network_check('\ue640'),
        gmd_network_locked('\ue61a'),
        gmd_network_wifi('\ue1ba'),
        gmd_new_releases('\ue031'),
        gmd_next_week('\ue16a'),
        gmd_nfc('\ue1bb'),
        gmd_no_encryption('\ue641'),
        gmd_no_sim('\ue0cc'),
        gmd_not_interested('\ue033'),
        gmd_note('\ue06f'),
        gmd_note_add('\ue89c'),
        gmd_notifications('\ue7f4'),
        gmd_notifications_active('\ue7f7'),
        gmd_notifications_none('\ue7f5'),
        gmd_notifications_off('\ue7f6'),
        gmd_notifications_paused('\ue7f8'),
        gmd_offline_pin('\ue90a'),
        gmd_ondemand_video('\ue63a'),
        gmd_opacity('\ue91c'),
        gmd_open_in_browser('\ue89d'),
        gmd_open_in_new('\ue89e'),
        gmd_open_with('\ue89f'),
        gmd_pages('\ue7f9'),
        gmd_pageview('\ue8a0'),
        gmd_palette('\ue40a'),
        gmd_pan_tool('\ue925'),
        gmd_panorama('\ue40b'),
        gmd_panorama_fish_eye('\ue40c'),
        gmd_panorama_horizontal('\ue40d'),
        gmd_panorama_vertical('\ue40e'),
        gmd_panorama_wide_angle('\ue40f'),
        gmd_party_mode('\ue7fa'),
        gmd_pause('\ue034'),
        gmd_pause_circle_filled('\ue035'),
        gmd_pause_circle_outline('\ue036'),
        gmd_payment('\ue8a1'),
        gmd_people('\ue7fb'),
        gmd_people_outline('\ue7fc'),
        gmd_perm_camera_mic('\ue8a2'),
        gmd_perm_contact_calendar('\ue8a3'),
        gmd_perm_data_setting('\ue8a4'),
        gmd_perm_device_information('\ue8a5'),
        gmd_perm_identity('\ue8a6'),
        gmd_perm_media('\ue8a7'),
        gmd_perm_phone_msg('\ue8a8'),
        gmd_perm_scan_wifi('\ue8a9'),
        gmd_person('\ue7fd'),
        gmd_person_add('\ue7fe'),
        gmd_person_outline('\ue7ff'),
        gmd_person_pin('\ue55a'),
        gmd_person_pin_circle('\ue56a'),
        gmd_personal_video('\ue63b'),
        gmd_pets('\ue91d'),
        gmd_phone('\ue0cd'),
        gmd_phone_android('\ue324'),
        gmd_phone_bluetooth_speaker('\ue61b'),
        gmd_phone_forwarded('\ue61c'),
        gmd_phone_in_talk('\ue61d'),
        gmd_phone_iphone('\ue325'),
        gmd_phone_locked('\ue61e'),
        gmd_phone_missed('\ue61f'),
        gmd_phone_paused('\ue620'),
        gmd_phonelink('\ue326'),
        gmd_phonelink_erase('\ue0db'),
        gmd_phonelink_lock('\ue0dc'),
        gmd_phonelink_off('\ue327'),
        gmd_phonelink_ring('\ue0dd'),
        gmd_phonelink_setup('\ue0de'),
        gmd_photo('\ue410'),
        gmd_photo_album('\ue411'),
        gmd_photo_camera('\ue412'),
        gmd_photo_filter('\ue43b'),
        gmd_photo_library('\ue413'),
        gmd_photo_size_select_actual('\ue432'),
        gmd_photo_size_select_large('\ue433'),
        gmd_photo_size_select_small('\ue434'),
        gmd_picture_as_pdf('\ue415'),
        gmd_picture_in_picture('\ue8aa'),
        gmd_picture_in_picture_alt('\ue911'),
        gmd_pie_chart('\ue6c4'),
        gmd_pie_chart_outlined('\ue6c5'),
        gmd_pin_drop('\ue55e'),
        gmd_place('\ue55f'),
        gmd_play_arrow('\ue037'),
        gmd_play_circle_filled('\ue038'),
        gmd_play_circle_outline('\ue039'),
        gmd_play_for_work('\ue906'),
        gmd_playlist_add('\ue03b'),
        gmd_playlist_add_check('\ue065'),
        gmd_playlist_play('\ue05f'),
        gmd_plus_one('\ue800'),
        gmd_poll('\ue801'),
        gmd_polymer('\ue8ab'),
        gmd_pool('\ueb48'),
        gmd_portable_wifi_off('\ue0ce'),
        gmd_portrait('\ue416'),
        gmd_power('\ue63c'),
        gmd_power_input('\ue336'),
        gmd_power_settings_new('\ue8ac'),
        gmd_pregnant_woman('\ue91e'),
        gmd_present_to_all('\ue0df'),
        gmd_print('\ue8ad'),
        gmd_priority_high('\ue645'),
        gmd_public('\ue80b'),
        gmd_publish('\ue255'),
        gmd_query_builder('\ue8ae'),
        gmd_question_answer('\ue8af'),
        gmd_queue('\ue03c'),
        gmd_queue_music('\ue03d'),
        gmd_queue_play_next('\ue066'),
        gmd_radio('\ue03e'),
        gmd_radio_button_checked('\ue837'),
        gmd_radio_button_unchecked('\ue836'),
        gmd_rate_review('\ue560'),
        gmd_receipt('\ue8b0'),
        gmd_recent_actors('\ue03f'),
        gmd_record_voice_over('\ue91f'),
        gmd_redeem('\ue8b1'),
        gmd_redo('\ue15a'),
        gmd_refresh('\ue5d5'),
        gmd_remove('\ue15b'),
        gmd_remove_circle('\ue15c'),
        gmd_remove_circle_outline('\ue15d'),
        gmd_remove_from_queue('\ue067'),
        gmd_remove_red_eye('\ue417'),
        gmd_remove_shopping_cart('\ue928'),
        gmd_reorder('\ue8fe'),
        gmd_repeat('\ue040'),
        gmd_repeat_one('\ue041'),
        gmd_replay('\ue042'),
        gmd_replay_10('\ue059'),
        gmd_replay_30('\ue05a'),
        gmd_replay_5('\ue05b'),
        gmd_reply('\ue15e'),
        gmd_reply_all('\ue15f'),
        gmd_report('\ue160'),
        gmd_report_problem('\ue8b2'),
        gmd_restaurant('\ue56c'),
        gmd_restaurant_menu('\ue561'),
        gmd_restore('\ue8b3'),
        gmd_restore_page('\ue929'),
        gmd_ring_volume('\ue0d1'),
        gmd_room('\ue8b4'),
        gmd_room_service('\ueb49'),
        gmd_rotate_90_degrees_ccw('\ue418'),
        gmd_rotate_left('\ue419'),
        gmd_rotate_right('\ue41a'),
        gmd_rounded_corner('\ue920'),
        gmd_router('\ue328'),
        gmd_rowing('\ue921'),
        gmd_rss_feed('\ue0e5'),
        gmd_rv_hookup('\ue642'),
        gmd_satellite('\ue562'),
        gmd_save('\ue161'),
        gmd_scanner('\ue329'),
        gmd_schedule('\ue8b5'),
        gmd_school('\ue80c'),
        gmd_screen_lock_landscape('\ue1be'),
        gmd_screen_lock_portrait('\ue1bf'),
        gmd_screen_lock_rotation('\ue1c0'),
        gmd_screen_rotation('\ue1c1'),
        gmd_screen_share('\ue0e2'),
        gmd_sd_card('\ue623'),
        gmd_sd_storage('\ue1c2'),
        gmd_search('\ue8b6'),
        gmd_security('\ue32a'),
        gmd_select_all('\ue162'),
        gmd_send('\ue163'),
        gmd_sentiment_dissatisfied('\ue811'),
        gmd_sentiment_neutral('\ue812'),
        gmd_sentiment_satisfied('\ue813'),
        gmd_sentiment_very_dissatisfied('\ue814'),
        gmd_sentiment_very_satisfied('\ue815'),
        gmd_settings('\ue8b8'),
        gmd_settings_applications('\ue8b9'),
        gmd_settings_backup_restore('\ue8ba'),
        gmd_settings_bluetooth('\ue8bb'),
        gmd_settings_brightness('\ue8bd'),
        gmd_settings_cell('\ue8bc'),
        gmd_settings_ethernet('\ue8be'),
        gmd_settings_input_antenna('\ue8bf'),
        gmd_settings_input_component('\ue8c0'),
        gmd_settings_input_composite('\ue8c1'),
        gmd_settings_input_hdmi('\ue8c2'),
        gmd_settings_input_svideo('\ue8c3'),
        gmd_settings_overscan('\ue8c4'),
        gmd_settings_phone('\ue8c5'),
        gmd_settings_power('\ue8c6'),
        gmd_settings_remote('\ue8c7'),
        gmd_settings_system_daydream('\ue1c3'),
        gmd_settings_voice('\ue8c8'),
        gmd_share('\ue80d'),
        gmd_shop('\ue8c9'),
        gmd_shop_two('\ue8ca'),
        gmd_shopping_basket('\ue8cb'),
        gmd_shopping_cart('\ue8cc'),
        gmd_short_text('\ue261'),
        gmd_show_chart('\ue6e1'),
        gmd_shuffle('\ue043'),
        gmd_signal_cellular_4_bar('\ue1c8'),
        gmd_signal_cellular_connected_no_internet_4_bar('\ue1cd'),
        gmd_signal_cellular_no_sim('\ue1ce'),
        gmd_signal_cellular_null('\ue1cf'),
        gmd_signal_cellular_off('\ue1d0'),
        gmd_signal_wifi_4_bar('\ue1d8'),
        gmd_signal_wifi_4_bar_lock('\ue1d9'),
        gmd_signal_wifi_off('\ue1da'),
        gmd_sim_card('\ue32b'),
        gmd_sim_card_alert('\ue624'),
        gmd_skip_next('\ue044'),
        gmd_skip_previous('\ue045'),
        gmd_slideshow('\ue41b'),
        gmd_slow_motion_video('\ue068'),
        gmd_smartphone('\ue32c'),
        gmd_smoke_free('\ueb4a'),
        gmd_smoking_rooms('\ueb4b'),
        gmd_sms('\ue625'),
        gmd_sms_failed('\ue626'),
        gmd_snooze('\ue046'),
        gmd_sort('\ue164'),
        gmd_sort_by_alpha('\ue053'),
        gmd_spa('\ueb4c'),
        gmd_space_bar('\ue256'),
        gmd_speaker('\ue32d'),
        gmd_speaker_group('\ue32e'),
        gmd_speaker_notes('\ue8cd'),
        gmd_speaker_notes_off('\ue92a'),
        gmd_speaker_phone('\ue0d2'),
        gmd_spellcheck('\ue8ce'),
        gmd_star('\ue838'),
        gmd_star_border('\ue83a'),
        gmd_star_half('\ue839'),
        gmd_stars('\ue8d0'),
        gmd_stay_current_landscape('\ue0d3'),
        gmd_stay_current_portrait('\ue0d4'),
        gmd_stay_primary_landscape('\ue0d5'),
        gmd_stay_primary_portrait('\ue0d6'),
        gmd_stop('\ue047'),
        gmd_stop_screen_share('\ue0e3'),
        gmd_storage('\ue1db'),
        gmd_store('\ue8d1'),
        gmd_store_mall_directory('\ue563'),
        gmd_straighten('\ue41c'),
        gmd_streetview('\ue56e'),
        gmd_strikethrough_s('\ue257'),
        gmd_style('\ue41d'),
        gmd_subdirectory_arrow_left('\ue5d9'),
        gmd_subdirectory_arrow_right('\ue5da'),
        gmd_subject('\ue8d2'),
        gmd_subscriptions('\ue064'),
        gmd_subtitles('\ue048'),
        gmd_subway('\ue56f'),
        gmd_supervisor_account('\ue8d3'),
        gmd_surround_sound('\ue049'),
        gmd_swap_calls('\ue0d7'),
        gmd_swap_horiz('\ue8d4'),
        gmd_swap_vert('\ue8d5'),
        gmd_swap_vertical_circle('\ue8d6'),
        gmd_switch_camera('\ue41e'),
        gmd_switch_video('\ue41f'),
        gmd_sync('\ue627'),
        gmd_sync_disabled('\ue628'),
        gmd_sync_problem('\ue629'),
        gmd_system_update('\ue62a'),
        gmd_system_update_alt('\ue8d7'),
        gmd_tab('\ue8d8'),
        gmd_tab_unselected('\ue8d9'),
        gmd_tablet('\ue32f'),
        gmd_tablet_android('\ue330'),
        gmd_tablet_mac('\ue331'),
        gmd_tag_faces('\ue420'),
        gmd_tap_and_play('\ue62b'),
        gmd_terrain('\ue564'),
        gmd_text_fields('\ue262'),
        gmd_text_format('\ue165'),
        gmd_textsms('\ue0d8'),
        gmd_texture('\ue421'),
        gmd_theaters('\ue8da'),
        gmd_thumb_down('\ue8db'),
        gmd_thumb_up('\ue8dc'),
        gmd_thumbs_up_down('\ue8dd'),
        gmd_time_to_leave('\ue62c'),
        gmd_timelapse('\ue422'),
        gmd_timeline('\ue922'),
        gmd_timer('\ue425'),
        gmd_timer_10('\ue423'),
        gmd_timer_3('\ue424'),
        gmd_timer_off('\ue426'),
        gmd_title('\ue264'),
        gmd_toc('\ue8de'),
        gmd_today('\ue8df'),
        gmd_toll('\ue8e0'),
        gmd_tonality('\ue427'),
        gmd_touch_app('\ue913'),
        gmd_toys('\ue332'),
        gmd_track_changes('\ue8e1'),
        gmd_traffic('\ue565'),
        gmd_train('\ue570'),
        gmd_tram('\ue571'),
        gmd_transfer_within_a_station('\ue572'),
        gmd_transform('\ue428'),
        gmd_translate('\ue8e2'),
        gmd_trending_down('\ue8e3'),
        gmd_trending_flat('\ue8e4'),
        gmd_trending_up('\ue8e5'),
        gmd_tune('\ue429'),
        gmd_turned_in('\ue8e6'),
        gmd_turned_in_not('\ue8e7'),
        gmd_tv('\ue333'),
        gmd_unarchive('\ue169'),
        gmd_undo('\ue166'),
        gmd_unfold_less('\ue5d6'),
        gmd_unfold_more('\ue5d7'),
        gmd_update('\ue923'),
        gmd_usb('\ue1e0'),
        gmd_verified_user('\ue8e8'),
        gmd_vertical_align_bottom('\ue258'),
        gmd_vertical_align_center('\ue259'),
        gmd_vertical_align_top('\ue25a'),
        gmd_vibration('\ue62d'),
        gmd_video_call('\ue070'),
        gmd_video_label('\ue071'),
        gmd_video_library('\ue04a'),
        gmd_videocam('\ue04b'),
        gmd_videocam_off('\ue04c'),
        gmd_videogame_asset('\ue338'),
        gmd_view_agenda('\ue8e9'),
        gmd_view_array('\ue8ea'),
        gmd_view_carousel('\ue8eb'),
        gmd_view_column('\ue8ec'),
        gmd_view_comfy('\ue42a'),
        gmd_view_compact('\ue42b'),
        gmd_view_day('\ue8ed'),
        gmd_view_headline('\ue8ee'),
        gmd_view_list('\ue8ef'),
        gmd_view_module('\ue8f0'),
        gmd_view_quilt('\ue8f1'),
        gmd_view_stream('\ue8f2'),
        gmd_view_week('\ue8f3'),
        gmd_vignette('\ue435'),
        gmd_visibility('\ue8f4'),
        gmd_visibility_off('\ue8f5'),
        gmd_voice_chat('\ue62e'),
        gmd_voicemail('\ue0d9'),
        gmd_volume_down('\ue04d'),
        gmd_volume_mute('\ue04e'),
        gmd_volume_off('\ue04f'),
        gmd_volume_up('\ue050'),
        gmd_vpn_key('\ue0da'),
        gmd_vpn_lock('\ue62f'),
        gmd_wallpaper('\ue1bc'),
        gmd_warning('\ue002'),
        gmd_watch('\ue334'),
        gmd_watch_later('\ue924'),
        gmd_wb_auto('\ue42c'),
        gmd_wb_cloudy('\ue42d'),
        gmd_wb_incandescent('\ue42e'),
        gmd_wb_iridescent('\ue436'),
        gmd_wb_sunny('\ue430'),
        gmd_wc('\ue63d'),
        gmd_web('\ue051'),
        gmd_web_asset('\ue069'),
        gmd_weekend('\ue16b'),
        gmd_whatshot('\ue80e'),
        gmd_widgets('\ue1bd'),
        gmd_wifi('\ue63e'),
        gmd_wifi_lock('\ue1e1'),
        gmd_wifi_tethering('\ue1e2'),
        gmd_work('\ue8f9'),
        gmd_wrap_text('\ue25b'),
        gmd_youtube_searched_for('\ue8fa'),
        gmd_zoom_in('\ue8ff'),
        gmd_zoom_out('\ue900'),
        gmd_zoom_out_map('\ue56b');

        char character;

        Icon(char character) {
            this.character = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return character;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static ITypeface typeface;

        public ITypeface getTypeface() {
            if (typeface == null) {
                typeface = new GoogleMaterial();
            }
            return typeface;
        }
    }
}
