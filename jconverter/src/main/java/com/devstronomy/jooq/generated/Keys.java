/*
 * This file is generated by jOOQ.
 */
package com.devstronomy.jooq.generated;


import com.devstronomy.jooq.generated.tables.Planet;
import com.devstronomy.jooq.generated.tables.records.PlanetRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>devstronomy</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<PlanetRecord, Integer> IDENTITY_PLANET = Identities0.IDENTITY_PLANET;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<PlanetRecord> KEY_PLANET_PRIMARY = UniqueKeys0.KEY_PLANET_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<PlanetRecord, Integer> IDENTITY_PLANET = Internal.createIdentity(Planet.PLANET, Planet.PLANET.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<PlanetRecord> KEY_PLANET_PRIMARY = Internal.createUniqueKey(Planet.PLANET, "KEY_planet_PRIMARY", Planet.PLANET.ID);
    }
}